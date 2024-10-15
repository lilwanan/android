package com.example.calculadorabuena;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public EditText et1,et2;
    public TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);

    }

    public void sumar(View view){ // hay que indicarle que es una lisa
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int suma = num1 + num2;
        String result = String.valueOf(suma);
        tv1.setText(result);
    }

    public void restar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int resta = num1 - num2;
        String result = String.valueOf(resta);
        tv1.setText(result);
    }

    public void multiplicar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int multi = num1 * num2;
        String result = String.valueOf(multi);
        tv1.setText(result);
    }

    public void dividir(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        double division = (double) num1 / num2;
        String result = String.valueOf(division);
        tv1.setText(result);
    }

}