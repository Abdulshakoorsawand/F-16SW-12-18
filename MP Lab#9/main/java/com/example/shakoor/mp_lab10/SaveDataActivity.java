package com.example.umairahmed.mp_lab10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SaveDataActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference reference;

    EditText editText_RollNum, editText_Name;
    Button button_Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_data);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("Data");


        editText_RollNum = findViewById(R.id.edit_roll_num);
        editText_Name = findViewById(R.id.edit_name);
        button_Save = findViewById(R.id.button_save);


        button_Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String rollNum = editText_RollNum.getText().toString();
                String name = editText_Name.getText().toString();

                if(!rollNum.isEmpty() && !name.isEmpty()){

                    Intent intent = new Intent(SaveDataActivity.this, MainActivity.class);
                    intent.putExtra("get_roll",rollNum);
                    intent.putExtra("get_name",name);
                    startActivity(intent);
                }
                else{

                    Toast.makeText(SaveDataActivity.this, "You must fill the fields first", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
