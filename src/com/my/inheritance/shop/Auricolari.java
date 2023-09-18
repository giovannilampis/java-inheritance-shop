package com.my.inheritance.shop;

public class Auricolari extends Prodotto {
	
    private String colore;
    private boolean wireless;

    public Auricolari(String codice, String nome, String marca, double prezzo, String colore, boolean wireless) {
        super(codice, nome, marca, prezzo);
        this.colore = colore;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColore: " + colore + "\nTipo: " + (wireless ? "Wireless" : "Cablati");
    }
}
