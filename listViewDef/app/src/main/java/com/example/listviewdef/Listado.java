package com.example.listviewdef;

import java.util.ArrayList;

public class Listado {
    public ArrayList<Lista> datos;
    public Listado() { // constructor vacio
        datos = new ArrayList<Lista>();
        // creo los valores añadido al arraylist
        datos.add(new Lista(R.drawable.luffy,"Monkey D.Luffy", "Recompensa:3.000.000.000"));
        datos.add(new Lista(R.drawable.zoro,"Roronoa Zoro", "Recompensa:1.111.000.000"));
        datos.add(new Lista(R.drawable.jimbe,"Jinbe", "Recompensa:1.100.000.000"));
        datos.add(new Lista(R.drawable.sanji,"Vinsmoke Sanji", "Recompensa:1.032.000.000"));
        datos.add(new Lista(R.drawable.robin,"Nico Robin", "Recompensa:930.000.000"));
        datos.add(new Lista(R.drawable.ussop,"Usopp", "Recompensa:500.000.000"));
        datos.add(new Lista(R.drawable.franky,"Franky", "Recompensa:394.000.000"));
        datos.add(new Lista(R.drawable.brook,"Brook", "Recompensa:383.000.000"));
        datos.add(new Lista(R.drawable.nami,"Nami", "Recompensa:366.000.000"));
        datos.add(new Lista(R.drawable.chopper,"Tony Tony Chopper", "Recompensa:1.000"));
    }

    public ArrayList<Lista> getDatos(){
        return this.datos;
    }
}
