package com.example.firebase_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second_Activity extends AppCompatActivity {

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        textView = findViewById(R.id.textView2);

        Intent intent = getIntent();

        String s = intent.getStringExtra("Passed");
        textView.setText(s);

    }
}
