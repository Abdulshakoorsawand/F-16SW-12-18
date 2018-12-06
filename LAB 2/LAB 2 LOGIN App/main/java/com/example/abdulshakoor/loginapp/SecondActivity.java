package com.example.abdulshakoor.loginapp;

import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText e1, e2 ;
    Button b1;
    String getName, getPassword , password, name , email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e1 = findViewById(R.id.nameId);
        e2 = findViewById(R.id.paswordId);
        b1 = findViewById(R.id.logInId);
        Intent in = getIntent();
        getName = in.getStringExtra("namekey");
        getPassword = in.getStringExtra("passwordkey");
        email = in.getStringExtra("emailkey");
        name = e1.getText().toString();
        password = e2.getText().toString();

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

           if(name.equals(getName.toString()) || password.equals(getPassword.toString())){
                Intent i = new Intent(SecondActivity.this , ThirdActivity.class);
                i.putExtra("setName", name);
               i.putExtra("setMail" , email);
                startActivity(i);

            } else {
                        Toast.makeText(SecondActivity.this, "User name or Password Incorrect", Toast.LENGTH_SHORT).show();
            }
        }
    });

}}
