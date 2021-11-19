package com.ejtdevelopment.receiver2test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyReceiver mr = new MyReceiver();
    LowestPriorityReceiver lpr = new LowestPriorityReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        IntentFilter intent = new IntentFilter("CUSTOM_BROADCAST");
        registerReceiver(mr,intent);

        intent = new IntentFilter("PRIORITY_BROADCASTING");
        intent.setPriority(0);
        registerReceiver(lpr,intent); // dynamic broadcasting
        }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mr);
        unregisterReceiver(lpr);
    }
}
