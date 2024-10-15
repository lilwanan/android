package com.example.tabla;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public TextView tv1,tv2,tv3,tv4,tv5,tv6, res;

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
        res = findViewById(R.id.res);

        String valor1 = tv1.getText().toString();
        String valor2 = tv2.getText().toString();
        String valor3 = tv3.getText().toString();
        String valor4 = tv4.getText().toString();
        String valor5 = tv5.getText().toString();
        String valor6 = tv6.getText().toString();

        int total = Integer.parseInt(valor1) + Integer.parseInt(valor2) + Integer.parseInt(valor3)
                + Integer.parseInt(valor4) + Integer.parseInt(valor5) + Integer.parseInt(valor6);
        String result = String.valueOf(total);
        res.setText(result);

    }
}