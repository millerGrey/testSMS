package com.example.testsms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SMSreceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"You are getting new SMS ", Toast.LENGTH_LONG).show();
        abortBroadcast();
    }
}
