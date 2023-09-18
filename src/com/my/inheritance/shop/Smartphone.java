package com.my.inheritance.shop;

public class Smartphone extends Prodotto {

    private String imei;
    private int memoria;

    public Smartphone(String codice, String nome, String marca, double prezzo, String imei, int memoria) {
        super(codice, nome, marca, prezzo);
        this.imei = imei;
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIMEI: " + imei + "\nMemoria: " + memoria + " GB";
    }
}
