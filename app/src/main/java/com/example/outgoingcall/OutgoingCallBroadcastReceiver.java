package com.example.outgoingcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class OutgoingCallBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String phoneNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);

        Log.d(OutgoingCallBroadcastReceiver.class.getSimpleName(), intent.toString());
        Toast.makeText(context, "Outgoing call catched!", Toast.LENGTH_LONG).show();

    }
}