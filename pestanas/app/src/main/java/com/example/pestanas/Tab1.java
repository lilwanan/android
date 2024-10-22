package com.example.pestanas;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class Tab1 extends Fragment {
//Parecido a una actividad dispone de un metodo especifico para crear
    //la vista
    //container contenido donde se tiene previsto inserta el layout y el momento
    //ya mismo con true
    public ImageButton imgbtn;
    public ImageView ima;

    public Tab1() {


    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_new, container, false);
        ima=view.findViewById(R.id.imgbut1);
        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                startActivity(intent);


            }
        });

        return view;

    }


}