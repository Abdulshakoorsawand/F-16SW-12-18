package com.example.abdulshakoor.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView t1, t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        t1 = findViewById(R.id.textView2);
        t2 = findViewById(R.id.textView3);

        Intent i = getIntent();
        String name = i.getStringExtra("setName");
        String mail = i.getStringExtra("setMail");

        t1.setText(name);
        t2.setText(mail);
    }
}
