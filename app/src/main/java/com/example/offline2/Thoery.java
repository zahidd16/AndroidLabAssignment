package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Thoery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thoery);
    }

    public void p(View view) {
        if(view ==findViewById(R.id.l))
        {

            Intent i2= new Intent(Thoery.this,Main2Activity.class);
            startActivity(i2);
        }
    }
}
