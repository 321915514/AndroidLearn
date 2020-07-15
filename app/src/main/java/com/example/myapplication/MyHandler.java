package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class MyHandler extends Handler {
    private Context mContext;
    MyHandler(Context context){
        mContext = context;
    }
    @Override
    public void handleMessage(@NonNull Message msg) {

        if(msg.what==1){
                Toast.makeText(mContext,"tbhjbhjbjbj",Toast.LENGTH_LONG).show();
        }
    }
}
