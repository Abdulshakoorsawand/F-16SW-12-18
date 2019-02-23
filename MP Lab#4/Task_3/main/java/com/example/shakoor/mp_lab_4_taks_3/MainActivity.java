package com.example.umairahmed.mp_lab_4_taks_3;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager sensorManager;
    Sensor gyroScope;
    int index = 0;
    ImageView imageView;
    int images[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        gyroScope = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        if(gyroScope == null) {
            finish();
        }
    }
    @Override
    protected void onResume() {
        sensorManager.registerListener(this, gyroScope, SensorManager.SENSOR_DELAY_NORMAL);
        super.onResume();
    }
    @Override
    protected  void onPause() {
        sensorManager.unregisterListener(this);
        super.onPause();
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.values[2] > 0.2) {
            if(index == 7)
                index = 0;
            imageView.setImageResource(images[index]);
            index++;
        }
        else if(event.values[2] < -0.2) {
            if(index == 7)
                index = 0;
            imageView.setImageResource(images[index]);
            index++;
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}