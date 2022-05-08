package com.example.upskill.ui.regFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegFragmentViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public RegFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is reg fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
