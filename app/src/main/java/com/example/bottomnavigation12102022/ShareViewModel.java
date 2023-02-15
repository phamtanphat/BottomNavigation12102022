package com.example.bottomnavigation12102022;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by pphat on 2/15/2023.
 */
public class ShareViewModel extends ViewModel {
    private MutableLiveData<Float> ratingLiveData = new MutableLiveData<>();

    public LiveData<Float> getRatingLiveData() {
        return ratingLiveData;
    }

    public void setRatingLiveData(Float rating) {
        ratingLiveData.setValue(rating);
    }
}
