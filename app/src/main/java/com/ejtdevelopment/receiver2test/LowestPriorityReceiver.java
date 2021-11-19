package com.ejtdevelopment.receiver2test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class LowestPriorityReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "LOWEST PRIORITY", Toast.LENGTH_SHORT).show();
    }
}