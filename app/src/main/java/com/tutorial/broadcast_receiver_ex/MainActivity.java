package com.tutorial.broadcast_receiver_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowBroadcast(View view){
        EditText st = (EditText)findViewById(R.id.txtMsg);
        Intent intent = new Intent();
        intent.putExtra("msg",(CharSequence)st.getText().toString());
        intent.setAction("com.tutorial.broadcast_receiver_ex.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
