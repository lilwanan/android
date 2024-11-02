package com.example.listviewdef;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    public final static String EXTRA_NOMBRE = "cualquier cosa";
    public final static String TEXTVIEW_EJEMPLO="textView ejemplo";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Listado listado = new Listado();
        ArrayList<Lista> datos = listado.getDatos();
        lista = (ListView) findViewById(R.id.ListView_listado);
        lista.setAdapter(new ListaAdaptador(this, R.layout.articulo, datos));
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}