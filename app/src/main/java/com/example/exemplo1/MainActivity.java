package com.example.exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Oncreate", "entrou no oncreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("OnStart", "entrou no onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("OnResume", "entrou no onResume");
    }

}