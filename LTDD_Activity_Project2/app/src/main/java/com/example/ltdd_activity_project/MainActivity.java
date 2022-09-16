package com.example.ltdd_activity_project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnmain;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmain = (Button) findViewById(R.id.btnmain);
        btnmain.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, ChildActivity.class);
            startActivity(intent);
        });
        Log.d("AAA", "onCreate Main");
    }

    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart Main");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("AAA", "onRestart Main");
    }

    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause Main");
    }

    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop Main");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy Main");
    }
}
