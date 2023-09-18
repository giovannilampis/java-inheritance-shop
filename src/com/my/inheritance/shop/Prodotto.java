package com.my.inheritance.shop;

public class Prodotto {

    private final String codice;
    private String nome;
    private String marca;
    private double prezzo;
    private final double iva = 0.22;
    
    
    public Prodotto(String codice, String nome, String marca, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
    }
    
    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double calcolaPrezzoConIva() {
        return prezzo * (1 + iva);
    }

    @Override
    public String toString() {
        return "Codice: " + codice + "\nNome: " + nome + "\nMarca: " + marca + "\nPrezzo: " + prezzo + "\nIva: " + iva;
    }


}
