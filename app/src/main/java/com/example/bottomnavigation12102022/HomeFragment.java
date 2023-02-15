package com.example.bottomnavigation12102022;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

public class HomeFragment extends Fragment {

    RatingBar ratingBar;
    ShareViewModel shareViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ratingBar = view.findViewById(R.id.rating_bar_home);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        shareViewModel = new ViewModelProvider(requireActivity()).get(ShareViewModel.class);

        Log.d("BBB", "Fragment " + shareViewModel);
        shareViewModel.getRatingLiveData().observe(getViewLifecycleOwner(), new Observer<Float>() {
            @Override
            public void onChanged(Float rating) {
                if (rating != null) {
                    ratingBar.setRating(rating);
                }
            }
        });
    }

}
