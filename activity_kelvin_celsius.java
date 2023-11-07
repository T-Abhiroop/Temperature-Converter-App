package  com.example.temperatureconverter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_kelvin_celsius extends AppCompatActivity {


    Button b,b1;
    EditText e;
    TextView t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_celsius);


        b=findViewById(R.id.button15);
        b1=findViewById(R.id.button14);
        e=findViewById(R.id.editTextText5);
        t=findViewById(R.id.result7);

        b.setOnClickListener(view -> {
            Intent i=new Intent(activity_kelvin_celsius.this,MainActivity.class);
            startActivity(i);
            finish();
        });

        b1.setOnClickListener(view -> {
            String s1=e.getText().toString();
            double i=Double.parseDouble(s1);
            double r=i-273.15;
            String s2= Double.toString(r);
            t.setText(s2);
        });
    }
}