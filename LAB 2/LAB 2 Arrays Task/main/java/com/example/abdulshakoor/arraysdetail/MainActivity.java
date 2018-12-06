package com.example.abdulshakoor.arraysdetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.next);
        b2 = findViewById(R.id.previous);
        t1 = findViewById(R.id.name);
        t3 = findViewById(R.id.email);
        t2 = findViewById(R.id.rollnumber);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this , "there is no previous view " , Toast.LENGTH_SHORT).show();
        }
    });

       /* array = new ArrayList<>();

        array.add(0,"shakoor");
        array.add(1,"ALEE");
        array.add(2,"Saqlain");

        mail = new ArrayList<>();
        mail.add(0,"shakoorsawand@gmail.com");
        mail.add(1,"alee.kolachi@gmail.com");
        mail.add(2,"saqlainal22@gmail.com");

        rollno = new ArrayList<>();
        rollno.add(0,"f16-sw-12");
        rollno.add(1,"f16sw18");
        rollno.add(2,"f16sw140");
    } */

    }
}
