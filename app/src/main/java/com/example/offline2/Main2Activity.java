package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import  android.widget.*;
import android.content.*;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void p(View view) {
        if(view ==findViewById(R.id.f))
        {
            Toast.makeText(Main2Activity.this,"Thank You",Toast.LENGTH_SHORT).show();
            Intent i2= new Intent(Main2Activity.this,MainActivity.class);
            startActivity(i2);
        }
    }


}
