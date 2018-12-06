package com.example.abdulshakoor.arraysdetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button b1 , b2;
    TextView t1, t2 , t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b1 = findViewById(R.id.next);
        b2 =findViewById(R.id.previous);
        t1 = findViewById(R.id.name);
        t3= findViewById(R.id.email);
        t2 =findViewById(R.id.rollnumber);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this , ThirdActivity.class);

                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this , MainActivity.class);
                startActivity(i);
            }
        });
    }
}
