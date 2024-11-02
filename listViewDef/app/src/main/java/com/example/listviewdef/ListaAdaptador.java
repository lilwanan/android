package com.example.listviewdef;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaAdaptador extends BaseAdapter {
    private ArrayList<?> entradas;
    private int R_layout_IdView;
    private Context contexto;

    public ListaAdaptador(Context contexto, int R_layout_IdView, ArrayList<?> entradas) {
        super();
        this.contexto = contexto;
        this.entradas = entradas;
        this.R_layout_IdView = R_layout_IdView;
    }

    @Override
    //Este método ha de construir un nuevo objeto View que será visualizado en la   posición position.
    // El último parámetro corresponde al contenedor de vistas donde el objeto va a ser añadido.
    public View getView(int posicion, View view, ViewGroup pariente) {
        if (view == null) {

            //LayoutInflater vi = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Inflamos la vista con nuestro propio layout
            LayoutInflater layoutInflater = LayoutInflater.from(pariente.getContext());

            view= layoutInflater.inflate(R.layout.articulo, null);
            // Valor actual según la posición

            //view = vi.inflate(R_layout_IdView, null);
        }
        //onEntrada (entradas.get(posicion), view);
        Lista entrada=(Lista) entradas.get(posicion);
        if (entrada != null) {
            TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior);
            if (texto_superior_entrada != null)
                texto_superior_entrada.setText(((Lista) entrada).getTxtSup());

            TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
            if (texto_inferior_entrada != null)
                texto_inferior_entrada.setText(((Lista) entrada).getTxtInf());

            ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen);
            if (imagen_entrada != null)
                imagen_entrada.setImageResource(((Lista) entrada).getId());
        }
        return view;
    }

    @Override
    //Devuelve el número de elementos de la lista.
    public int getCount() {
        return entradas.size();
    }

    @Override
    //  Devuelve el elemento en una determinada posición de la lista.
    public Object getItem(int posicion) {
        return entradas.get(posicion);
    }

    @Override
    //Devuelve el identificador de fila de una determinada posición de la lista
    public long getItemId(int posicion) {
        return posicion;
    }

}


