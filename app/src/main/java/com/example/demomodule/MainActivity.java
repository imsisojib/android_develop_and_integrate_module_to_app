package com.example.demomodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Activity from Module");

        EditText etAnything = findViewById(R.id.edittext_anything);

        findViewById(R.id.button_submit).setOnClickListener(v -> {
            String text = ""+etAnything.getText().toString();
            if (text.isEmpty()) Toast.makeText(this, "Nothing Written!", Toast.LENGTH_SHORT).show();
            else Toast.makeText(this, "You have typed -> "+text, Toast.LENGTH_SHORT).show();
        });

    }
}