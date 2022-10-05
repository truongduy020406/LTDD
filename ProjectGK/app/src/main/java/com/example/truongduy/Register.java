package com.example.truongduy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Register extends AppCompatActivity {
    Button Join;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Join = (Button) findViewById(R.id.JOIN);
        Join.setOnClickListener(view -> {
            Intent intent = new Intent(Register.this,MainActivity.class);
            startActivity(intent);
        });
    }
}