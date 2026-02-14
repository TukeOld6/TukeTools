package com.tuke.tools.ui.adbhelper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AdbHelperViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AdbHelperViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ADB Helper - Screen Mirroring");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
