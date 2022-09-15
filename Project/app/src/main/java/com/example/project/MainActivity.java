package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.Login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenProfile();
            }
        });

        button2 = findViewById(R.id.register);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenRegister();
            }
        });
    }
    private void OpenRegister() {
            Intent intent = new Intent(this , Register.class);
        startActivity(intent);
    }
    private void OpenProfile() {
        Intent intent = new Intent(this , Profile.class);
        startActivity(intent);
    }
}