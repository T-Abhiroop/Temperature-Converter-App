package com.example.temperatureconverter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_celsius_kelvin extends AppCompatActivity {


    Button b,b1;
    EditText e;
    TextView t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_kelvin);


        b=findViewById(R.id.button13);
        b1=findViewById(R.id.button12);
        e=findViewById(R.id.editTextText4);
        t=findViewById(R.id.result6);


        b.setOnClickListener(view -> {
            Intent i=new Intent(activity_celsius_kelvin.this,MainActivity.class);
            startActivity(i);
            finish();
        });

        b1.setOnClickListener(view -> {
            String s1=e.getText().toString();
            double i=Double.parseDouble(s1);
            double r=273.15+i;
            String s2= Double.toString(r);
            t.setText(s2);
        });

    }
}
