package com.rajendra.onlinedailygroceries.model;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rajendra.onlinedailygroceries.MainActivity;
import com.rajendra.onlinedailygroceries.R;
import com.rajendra.onlinedailygroceries.Register;

public class Login extends AppCompatActivity {
    Button btnDangNhap,btregister;
    EditText pass,user;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pass = findViewById(R.id.pass);
        user = findViewById(R.id.username);
        btnDangNhap =(Button) findViewById(R.id.login);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
                    Toast.makeText(Login.this,"Login Thanh cong",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(Login.this,"Login failed",Toast.LENGTH_SHORT).show();

            }
        });

        btregister =(Button) findViewById(R.id.register);
        btregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Register.class);

                startActivity(intent);
            }
        });
    }
}