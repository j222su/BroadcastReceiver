package com.example.broadcastreceiver_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver bcr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bcr=new BroadcastRecevier();

        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_HEADSET_PLUG);
        this.registerReceiver(bcr, intentFilter);
    }
}
