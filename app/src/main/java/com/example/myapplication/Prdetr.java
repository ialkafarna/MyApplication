package com.example.myapplication;

public class Prdetr {

String name;
String catcgort ;

double Prict;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatcgort() {
        return catcgort;
    }

    public void setCatcgort(String catcgort) {
        this.catcgort = catcgort;
    }

    public double getPrict() {
        return Prict;
    }

    public void setPrict(int prict) {
        Prict = prict;
    }

    public Prdetr(String name, String catcgort, double prict) {
        this.name = name;
        this.catcgort = catcgort;
        Prict = prict;
    }
}
