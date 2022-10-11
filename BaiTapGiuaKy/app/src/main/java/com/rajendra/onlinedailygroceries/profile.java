package com.rajendra.onlinedailygroceries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rajendra.onlinedailygroceries.model.Login;

public class profile extends AppCompatActivity {
    Button btlogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btlogout = (Button) findViewById(R.id.logout);
        btlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this , Login.class);
                Toast.makeText(profile.this,"Logout Thanh cong",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}