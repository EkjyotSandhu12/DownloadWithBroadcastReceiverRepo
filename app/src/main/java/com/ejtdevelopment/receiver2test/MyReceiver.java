package com.ejtdevelopment.receiver2test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.hasExtra("message"))
        Toast.makeText(context, "This is another app: " + intent.getStringExtra("message"), Toast.LENGTH_LONG).show();
        else
        Toast.makeText(context, "This is another app", Toast.LENGTH_LONG).show();
    }
}