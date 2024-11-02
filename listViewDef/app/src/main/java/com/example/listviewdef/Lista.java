package com.example.listviewdef;

public class Lista { // esta clase tiene la funcionalidad de crear  el tipo de dato que va a contener nuestro arraylist
    private int id;
    private String txtSup;
    private String txtInf;

    public Lista(int id,String txtSup, String txtInf){
        this.id=id;
        this.txtSup=txtSup;
        this.txtInf=txtInf;
    }

    public String getTxtSup() {
        return txtSup;
    }

    public int getId() {
        return id;
    }

    public String getTxtInf() {
        return txtInf;
    }
}
