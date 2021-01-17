package com.example.moduleintegratedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_open_activity_from_module).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, com.example.demomodule.MainActivity.class);
            startActivity(intent);
        });

    }
}