package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
       bt = findViewById(R.id.btnregister);
       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               OpenRegister();
           }
       });

    }
    private void OpenRegister() {
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }

}