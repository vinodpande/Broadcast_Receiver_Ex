package com.tutorial.broadcast_receiver_ex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AppBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        CharSequence iData = intent.getCharSequenceExtra("msg");
        Toast.makeText(context,"Received Message From Broadcast: "+iData,Toast.LENGTH_LONG).show();
    }
}