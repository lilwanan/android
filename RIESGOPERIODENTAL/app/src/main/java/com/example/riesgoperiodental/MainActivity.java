package com.example.riesgoperiodental;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public Button bt1,bt2,bt3,bt4,bt5,bt6;
    public TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    public EditText et1,et2,et3,et4,et5,et6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);

        tv7 = findViewById(R.id.tv7);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);











    }
    public void bt1(View view){
        String valor1 = et1.getText().toString();
        int num1 = Integer.parseInt(valor1);
        if (num1 < 10) {
            tv1.setText("Riesgo bajo");
        } else if (num1 >= 10 && num1 <= 25) {
            tv1.setText("Riesgo Moderado");

        } else {
            tv1.setText("Riesgo alto");
        }
    }

    public void bt2(View view){
        String valor2 = et2.getText().toString();
        int num1 = Integer.parseInt(valor2);
        if (num1 == 0) {
            tv2.setText("Riesgo nulo");
        } else if (num1 > 0 && num1 < 4) {
            tv2.setText("Riesgo bajo");
        } else if (num1 > 4 && num1 < 8) {
            tv2.setText("Riesgo medio");
        } else {
            tv2.setText("Riesgo alto");
        }
    }

    public void bt3(View view){
        String valor3 = et3.getText().toString();
        double num1 = Double.parseDouble(valor3);
        if (num1 > 0 && num1 < 0.5) {
            tv3.setText("Riesgo bajo");
        } else if (num1 >= 0.5 && num1 <= 1.0) {
            tv3.setText("Riesgo Moderado");
        } else {
            tv3.setText("Riesgo alto");
        }
    }

    public void bt4(View view){
        String valor4 = et4.getText().toString();
        boolean num1 = Boolean.parseBoolean(valor4);
        if (num1==true) {
            tv4.setText("Riesgo alto");
        } else {
            tv4.setText("Riesgo nulo");
        }
    }

    public void bt5(View view){
        String valor5 = et5.getText().toString();
        int num1 = Integer.parseInt(valor5);
        if (num1 == 1) {
            tv5.setText("Riesgo Alto");
        } else if (num1 == 2) {
            tv5.setText("Riesgo nulo");
        } else if (num1 == 3) {
            tv5.setText("Riesgo Moderado");
        }
    }

    public void bt6(View view){
        String valor6 = et6.getText().toString();
        int num1 = Integer.parseInt(valor6);
        if (num1 == 0) {
            tv6.setText("Riesgo nulo");
        } else if (num1 > 0 && num1 < 4) {
            tv6.setText("Riesgo bajo");
        } else if (num1 > 4 && num1 < 8) {
            tv6.setText("Riesgo medio");
        } else {
            tv6.setText("Riesgo alto");
        }
    }




}