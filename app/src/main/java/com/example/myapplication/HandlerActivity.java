package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

public class HandlerActivity extends AppCompatActivity {
    private static Handler handler;
    private Message msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(HandlerActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//        },3000);
        // 处理消息
        handler =new MyHandler(); // 自己调用handlermessage
        // 自线程
        new Thread(){
            @Override
            public void run() {
                msg = new Message();
                msg.what=1;
                handler.sendMessage(msg);
            }
        }.start();
    }
class MyHandler extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {
            if(msg.what==1){
                Toast.makeText(HandlerActivity.this,"tbhjbhjbjbj",Toast.LENGTH_LONG).show();
            }
        }
    }



}
