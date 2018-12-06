package com.example.abdulshakoor.messageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        t1 = findViewById(R.id.textView);
        Intent i = getIntent();
        String s = i.getStringExtra("name");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this ,SecondActivity.class);
                startActivity(i);
            }
        });
        t1.setText(s);
    }
}
