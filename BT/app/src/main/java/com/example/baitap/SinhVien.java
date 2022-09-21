package com.example.baitap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SinhVien extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinh_vien);

        textView = (TextView) findViewById(R.id.hoten);

        button = (Button) findViewById(R.id.button11);
        button.setOnClickListener((view) -> {

            String HOTENSV = textView.getText().toString();
            Intent intent = new Intent(SinhVien.this , MainActivity.class);
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
