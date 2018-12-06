package com.example.abdulshakoor.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText t1, t2, t3;
    RadioButton r1, r2;
    TextView t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.signup);
        t1 = findViewById(R.id.name);
        t2 = findViewById(R.id.email);
        t3 = findViewById(R.id.password);
        r1 = findViewById(R.id.radioButton);
        r2 = findViewById(R.id.radioButton2);
        t5 = findViewById(R.id.textview);
    }

   public void signUp(View v){
        Intent in = new Intent(MainActivity.this, SecondActivity.class);
        in.putExtra("namekey","t1.getText().toString()");
        in.putExtra("emailkey","t2.getText().toString()");
        in.putExtra("passwordkey","t3.getText().toString()");


        startActivity(in);
        }


    }

