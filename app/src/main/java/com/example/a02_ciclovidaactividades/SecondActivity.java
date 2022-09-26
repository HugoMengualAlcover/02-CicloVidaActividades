package com.example.a02_ciclovidaactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("ESTADOS","1-Ejecuto onCreate ACT2");

        btnVolver = findViewById(R.id.btnVolverSecond);
        btnVolver.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        }));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2-Ejecuto onStart ACT2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4-Ejecuto onPause ACT2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5-Ejecuto onStop ACT2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3-Ejecuto onResume ACT2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","6-Ejecuto onDestroy ACT2");
    }


}