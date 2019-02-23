package com.example.umairahmed.mp_lab10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class UpdateActivity extends AppCompatActivity {

    TextView get_RollNum,get_Name;
    Button button_Update, button_Delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        get_RollNum = findViewById(R.id.get_rollnum);
//        get_Name = findViewById(R.id.get_name);
        button_Update = findViewById(R.id.button_update);
        button_Delete = findViewById(R.id.button_update);


        Intent intent = getIntent();
        String getData = intent.getStringExtra("get_item");

        get_RollNum.setText(getData);
    }
}
