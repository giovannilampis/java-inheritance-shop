package com.my.inheritance.shop;

public class Televisore extends Prodotto {

    private int dimensioni;
    private boolean smart;

    public Televisore(String codice, String nome, String marca, double prezzo, int dimensioni, boolean smart) {
        super(codice, nome, marca, prezzo);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDimensioni: " + dimensioni + " pollici\nSmart: " + (smart ? "Sì" : "No");
    }
}
