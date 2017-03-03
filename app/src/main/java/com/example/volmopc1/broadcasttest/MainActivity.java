package com.example.volmopc1.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String g="sd";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BroadcastReceiver br = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context, "Intent Detecteddddddddddd.", Toast.LENGTH_LONG).show();
            }
        };
        registerReceiver(br, new IntentFilter("com.tutorialspoint.CUSTOM_INTENT" ));




        BroadcastReceiver brr = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context, "dddddddddddddd.", Toast.LENGTH_LONG).show();
            }
        };
        registerReceiver(brr, new IntentFilter(g));

    }



    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.tutorialspoint.CUSTOM_INTENT"); sendBroadcast(intent);
    }

    public void broadcastIntentt(View view){
        Intent intent = new Intent();
        intent.setAction(g); sendBroadcast(intent);
    }


}
