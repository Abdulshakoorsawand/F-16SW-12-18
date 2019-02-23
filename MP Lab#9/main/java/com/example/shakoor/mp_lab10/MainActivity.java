package com.example.umairahmed.mp_lab10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> theList = new ArrayList<>();
    Button addButton;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton=findViewById(R.id.add_button);
        listView=findViewById(R.id.list_view);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SaveDataActivity.class);
                startActivity(intent);
            }
        });

        final Intent intent = getIntent();
        String my_roll = intent.getStringExtra("get_roll");
        String my_name = intent.getStringExtra("get_name");

        theList.add(my_roll +"\n\n"+ my_name);
        ListAdapter listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,theList);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String item = (String) adapterView.getItemAtPosition(position);

                Intent intent1 = new Intent(MainActivity.this,UpdateActivity.class);
                intent1.putExtra("get_item",item);
                startActivity(intent1);
            }
        });
    }


}
