package com.example.truongduy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button register,login,BT1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register =(Button) findViewById(R.id.register);
        register.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Register.class);
            startActivity(intent);
        } );
        login =(Button) findViewById(R.id.button2);
        login.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Listview.class);
            startActivity(intent);
        });

        BT1 =(Button) findViewById(R.id.BN1);
        BT1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Profile.class);
            startActivity(intent);
        });
    }
}