package com.rajendra.onlinedailygroceries;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rajendra.onlinedailygroceries.model.Login;

public class profile extends AppCompatActivity {
    Button btlogout;
    BottomNavigationView navigationView;
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

        navigationView =(BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigationView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Home:
                        Intent intent = new Intent(profile.this,MainActivity.class);
                        startActivity(intent);
                        return true;

                    case R.id.about:
                        Intent i = new Intent(profile.this,Login.class);
                        startActivity(i);
                        return true;
                }

                return false;
            }
        });


    }
}