package com.example.ltdd_activity_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity extends Activity {
    Button btnchild;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        btnchild = (Button) findViewById(R.id.btnchild);
        btnchild.setOnClickListener((view) -> {
            Intent intent = new Intent(ChildActivity.this, MainActivity.class);
            startActivity(intent);
        });
        Log.d("AAA", "onCreate Child");
    }

    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart Child");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("AAA", "onRestart Child");
    }

    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause Child");
    }

    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop Child");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy Child");
    }
}
