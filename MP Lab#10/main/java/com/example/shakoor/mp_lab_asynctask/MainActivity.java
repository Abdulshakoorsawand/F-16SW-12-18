package com.example.umairahmed.mp_lab_asynctask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button2);
        progressBar = findViewById(R.id.progressBar);

    }
    public void start(View view ){
        AsyncTask task = new AsyncTask();
        task.execute(10);

    }
    private  class AsyncTask extends android.os.AsyncTask<Integer , Integer , String>{


        protected  void onPreExecute(){
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }
        @Override
        protected String doInBackground(Integer... integers) {
            for(int i=0; i<integers[0]; i++){
                publishProgress(i*100/integers[0]);
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            return "FINISHED";
        }
        protected  void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBar.setProgress(values[0]);
        }
        protected  void onPostExecute(String s){
            super.onPostExecute(s);
            Toast.makeText(MainActivity.this ,s, Toast.LENGTH_SHORT).show();
            progressBar.setProgress(0);
            progressBar.setVisibility(View.INVISIBLE);
        }
    }

}