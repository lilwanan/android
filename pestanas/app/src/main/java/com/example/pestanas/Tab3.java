package com.example.pestanas;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.VideoView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tab3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public Button botonAdelante,botonAtras,botonPause;
    public VideoView videoView;
    public ArrayList<String> videoLista;
    public int contador=0;
    public Spinner videoSpinner;
    public ArrayList<String> videoTitulos;


    public Tab3() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tab3, container, false);
        videoView = view.findViewById(R.id.videoView2);
        botonAdelante = view.findViewById(R.id.button2);
        botonAtras = view.findViewById(R.id.button3);
        botonPause= view.findViewById(R.id.button4);
        videoSpinner = view.findViewById(R.id.spinner);
        videoLista = new ArrayList<>();
        videoTitulos = new ArrayList<>();
        videoLista.add("android.resource://"+ getActivity().getPackageName()+"/" + R.raw.opening1);
        videoLista.add("android.resource://"+ getActivity().getPackageName()+"/" + R.raw.opening2);
        videoLista.add("android.resource://"+ getActivity().getPackageName()+"/" + R.raw.ending1);
        videoLista.add("android.resource://"+ getActivity().getPackageName()+"/" + R.raw.opening3);
        videoLista.add("android.resource://"+ getActivity().getPackageName()+"/" + R.raw.jajjajs);
        videoTitulos.add("Video 1");
        videoTitulos.add("Video 2");
        videoTitulos.add("Video 3");
        videoTitulos.add("Video 4");
        videoTitulos.add("Video 5");

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, videoTitulos); // el android.R.layout.... viene a ser un diseño usado para los spinner y como se verá los elementos
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // este viene a ser otro diseño predeterminado que es usado principalmente para mostrar desplegado el spinner al tapearlo
        videoSpinner.setAdapter(adaptador); //establece el adaptado a videoSpinner

        videoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int posicion, long l) { // int indica la psoicion en la que esta
                contador=posicion;
                loadVideo(contador);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        loadVideo(contador);




        botonAdelante.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(contador < videoLista.size()-1){
                    contador++;
                    loadVideo(contador);
                }
            }
        });

        botonAtras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(contador>0){
                    contador--;
                    loadVideo(contador);
                }
            }
        });

        botonPause.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(videoView.isPlaying()){
                    videoView.pause();

                } else {
                    videoView.start();
                }

            }
        });


        return view;
    }

    private void loadVideo(int contador) {
        Uri uri = Uri.parse(videoLista.get(contador));
        videoView.setVideoURI(uri);
        videoView.start();

    }

}