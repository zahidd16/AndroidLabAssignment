package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void m(View view) {
        if(view == findViewById(R.id.la))
        {
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);
        }
        if(view == findViewById(R.id.theo))
        {
            Intent i = new Intent(MainActivity.this,Thoery.class);
            startActivity(i);
        }

    }
}
