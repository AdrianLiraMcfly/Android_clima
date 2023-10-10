package com.cartelderamironuevageneracion.calculus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.cartelderamironuevageneracion.calculus.models.Celsius;
import com.cartelderamironuevageneracion.calculus.models.Farenheit;
import com.cartelderamironuevageneracion.calculus.models.Grado;
import com.cartelderamironuevageneracion.calculus.models.Kelvin;

public class MainActivity2 extends AppCompatActivity {

    Button kelvin, farenheit, celsius;
    EditText grados;
    TextView res1, res2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        grados = findViewById(R.id.grados);
        res1 = findViewById(R.id.res1);
        res2 = findViewById(R.id.res2);
        kelvin = findViewById(R.id.ke);
        farenheit = findViewById(R.id.fa);
        celsius = findViewById(R.id.cel);

        celsius.setOnClickListener(v -> {
                Celsius ce = new Celsius(Double.parseDouble(grados.getText().toString()));
                res1.setText(ce.parse(new Kelvin(0)).getValor().toString());
                res2.setText(ce.parse(new Farenheit(0)).getValor().toString());
        });

        farenheit.setOnClickListener(v -> {
                Farenheit fa = new Farenheit(Double.parseDouble(grados.getText().toString()));
                res1.setText(fa.parse(new Kelvin(0)).getValor().toString());
                res2.setText(fa.parse(new Celsius(0)).getValor().toString());
        });

        kelvin.setOnClickListener(v -> {
                Kelvin ke = new Kelvin(Double.parseDouble(grados.getText().toString()));
                res1.setText(ke.parse(new Farenheit(0)).getValor().toString());
                res2.setText(ke.parse(new Celsius(0)).getValor().toString());
        });
    }
}