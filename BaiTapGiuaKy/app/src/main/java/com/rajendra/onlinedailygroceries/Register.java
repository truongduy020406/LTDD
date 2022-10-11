package com.rajendra.onlinedailygroceries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rajendra.onlinedailygroceries.model.Login;

public class Register extends AppCompatActivity {
    Button btjoin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btjoin = (Button) findViewById(R.id.JOIN);
        btjoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this,Login.class);
                Toast.makeText(Register.this,"dang ky Thanh cong",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}