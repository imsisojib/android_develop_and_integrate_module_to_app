package com.example.moduleintegratedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.demomodule.MainActivity;

public class MainXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainx);

        findViewById(R.id.button_open_activity_from_module).setOnClickListener(v -> {
            Intent intent = new Intent(MainXActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }
}