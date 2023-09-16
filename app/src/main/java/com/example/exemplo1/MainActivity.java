package com.example.exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Oncreate", "entrou no oncreate");
        setContentView(R.layout.activity_main);

        editNome = (EditText) findViewById(R.id.editNome);
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

    public void btnMostrarClick(View view){
        Toast.makeText(this, "Olá " + editNome.getText(), Toast.LENGTH_SHORT).show();

    }

}