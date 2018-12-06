package com.example.abdulshakoor.multiactions;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1;
    Button b1, b2, b3, b4, b5, b6, b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.call);
        b2= findViewById(R.id.camera);
        b3= findViewById(R.id.contact);
        b4= findViewById(R.id.browser);
        b5= findViewById(R.id.calllog);
        b6= findViewById(R.id.gallery);
        b7= findViewById(R.id.dialpaid);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+t1.getText().toString()));
                startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);

                startActivity(cameraIntent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_INSERT_OR_EDIT);
                i.setType(ContactsContract.Contacts.CONTENT_ITEM_TYPE);

                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Uri uri = Uri.parse("http://www.google.com");
////                String url = t1.getText().toString();
////                Intent i = new Intent(Intent.ACTION_VIEW);
////                i.setData(Uri.parse(url));
////                startActivity(i);
                Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_EDIT);
                i.setType(ContactsContract.Contacts.CONTENT_ITEM_TYPE);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                final int ACTIVITY_SELECT_IMAGE = 1234;
                startActivityForResult(i, ACTIVITY_SELECT_IMAGE);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });
    }
//
//    public void dialButton(View v){
//        Intent in = new Intent(Intent.ACTION_DIAL );
//       in.setData(Uri.parse("tel:"+ t1.getText().toString()));
//        startActivity(in);
//    }
}
