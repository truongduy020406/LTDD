package com.example.baitap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bntNhap;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.editText2);
        String hotensv = getIntent().getStringExtra("edittext2");
        bntNhap = (Button) findViewById(R.id.Nhap);
        bntNhap.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this , SinhVien.class);
            startActivity(intent);
        });
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