package com.example.sbornikreceptov;

import java.util.ArrayList;

public class Ingerdient {
    String name;
    Double kolichestvo;
    String edinicyIzmerenya;
    String izobrazenye;

    public Ingerdient() {
    }
    public Ingerdient(String name) {
        this.name = name;
    }
    public Ingerdient(String name, Double kolichestvo, String edinicyIzmerenya) {
        this.name = name;
        this.kolichestvo = kolichestvo;
        this.edinicyIzmerenya = edinicyIzmerenya;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getKolichestvo() {
        return kolichestvo;
    }
    public void setKolichestvo(Double kolichestvo) {
        this.kolichestvo = kolichestvo;
    }
    public String getEdinicyIzmerenya() {
        return edinicyIzmerenya;
    }
    public void setEdinicyIzmerenya(String edinicyIzmerenya) {
        this.edinicyIzmerenya = edinicyIzmerenya;
    }
    public String getIzobrazenye() {
        return izobrazenye;
    }
    public void setIzobrazenye(String izobrazenye) {
        this.izobrazenye = izobrazenye;
    }
}
