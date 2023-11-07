package com.example.temperatureconverter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);


        b1.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,activity_celsius_to_fahrenheit.class);
            startActivity(i);
            finish();
        });


        b2.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,activity_fahrenheit_celsius.class);
            startActivity(i);
            finish();
        });

        b3.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,activity_fahrenheit_kelvin.class);
            startActivity(i);
            finish();
        });

        b4.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,activity_kelvin_fahrenheit.class);
            startActivity(i);
            finish();
        });

        b5.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,activity_celsius_kelvin.class);
            startActivity(i);
            finish();
        });

        b6.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,activity_kelvin_celsius.class);
            startActivity(i);
            finish();
        });
    }


}