package com.example.sony.databindingsample;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Sony on 12/28/2017.
 */

public class MyHandler {
    private final String TAG = MyHandler.class.toString();
    public void onClickName(View view){
        Log.d(TAG, "onclickButton");
    }
}
