package com.example.sbornikreceptov;

import java.util.ArrayList;
import java.util.Date;

public class Etap {
    String name;
    String opisanie;
    Date time;
    ArrayList<String> fotki;
    public Etap() {
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }
    public String getOpisanie() {
        return opisanie;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public ArrayList<String> getFotki() {
        return fotki;
    }
    public void setFotki(ArrayList<String> fotki) {
        this.fotki = fotki;
    }
}
