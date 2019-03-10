package com.example.sbornikreceptov;

import java.util.ArrayList;
import java.util.Date;

public class Recept {
    String name;
    String polnoeOpisanie;
    String kratkoeOpisanie;
    String foto;
    ArrayList<Ingerdient> ingerdienti;
    ArrayList<Etap> etapi;
    public Recept() {
    }
    public Recept(String name, String polnoeOpisanie, String kratkoeOpisanie) {
        this.name = name;
        this.polnoeOpisanie = polnoeOpisanie;
        this.kratkoeOpisanie = kratkoeOpisanie;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPolnoeOpisanie() {
        return polnoeOpisanie;
    }
    public void setPolnoeOpisanie(String polnoeOpisanie) {
        this.polnoeOpisanie = polnoeOpisanie;
    }
    public String getKratkoeOpisanie() {
        return kratkoeOpisanie;
    }
    public void setKratkoeOpisanie(String kratkoeOpisanie) {
        this.kratkoeOpisanie = kratkoeOpisanie;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public ArrayList<Ingerdient> getIngerdienti() {
        return ingerdienti;
    }
    public void setIngerdienti(ArrayList<Ingerdient> ingerdienti) {
        this.ingerdienti = ingerdienti;
    }
    public ArrayList<Etap> getEtapi() {
        return etapi;
    }
    public void setEtapi(ArrayList<Etap> etapi) {
        this.etapi = etapi;
    }
}

