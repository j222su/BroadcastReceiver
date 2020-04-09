package com.example.broadcastreceiver_test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastRecevier extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "이어폰!!!", Toast.LENGTH_LONG).show();
    }
}
