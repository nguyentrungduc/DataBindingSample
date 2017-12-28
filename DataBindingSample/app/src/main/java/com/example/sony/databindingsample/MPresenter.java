package com.example.sony.databindingsample;

import android.util.Log;
import android.view.View;

import com.example.sony.databindingsample.data.model.User;

/**
 * Created by Sony on 12/28/2017.
 */

public class MPresenter {

    public MPresenter() {
    }

    private static final String TAG = MPresenter.class.toString();
    public void onClick2(User user){
        Log.d(TAG, "ihiii");
        Log.d(TAG, user.toString());
    }
}
