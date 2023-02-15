package com.example.bottomnavigation12102022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAddHomeFragment;
    FragmentManager fragmentManager;
    ShareViewModel shareViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareViewModel = new ViewModelProvider(this).get(ShareViewModel.class);

        btnAddHomeFragment = findViewById(R.id.button_add_home_fragment);

        fragmentManager = getSupportFragmentManager();

        btnAddHomeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BBB", "Activity " + shareViewModel);
                HomeFragment homeFragment = (HomeFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_home);
                if (homeFragment != null) {
                    shareViewModel.setRatingLiveData(3f);
                }
            }
        });
    }
}
