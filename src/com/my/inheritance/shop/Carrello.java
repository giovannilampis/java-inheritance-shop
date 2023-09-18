package com.my.inheritance.shop;

import java.util.Scanner;

public class Carrello {
    private Prodotto[] prodotti;
    private int numeroProdotti;

    public Carrello() {
        prodotti = new Prodotto[10]; // Puoi regolare la dimensione dell'array a seconda delle tue esigenze.
        numeroProdotti = 0;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        if (numeroProdotti < prodotti.length) {
            prodotti[numeroProdotti] = prodotto;
            numeroProdotti++;
        } else {
            System.out.println("Il carrello è pieno.");
        }
    }

    public void stampaCarrello() {
        if (numeroProdotti == 0) {
            System.out.println("Il carrello è vuoto.");
            return;
        }

        System.out.println("Contenuto del carrello:");
        for (int i = 0; i < numeroProdotti; i++) {
            System.out.println(prodotti[i].toString());
            System.out.println(); // Linea vuota tra i prodotti
        }
    }

    public static boolean isSi(String input) {
        return input.equalsIgnoreCase("Sì");
    }

    public static void main(String[] args) {
        Carrello carrello = new Carrello();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Cosa vuoi creare nel carrello? (Smartphone/Televisore/Auricolari/Exit)");
            String scelta = scanner.nextLine();

            if (scelta.equalsIgnoreCase("Exit")) {
                break;
            }

            System.out.println("Inserisci il codice:");
            String codice = scanner.nextLine();
            System.out.println("Inserisci il nome:");
            String nome = scanner.nextLine();
            System.out.println("Inserisci la marca:");
            String marca = scanner.nextLine();
            System.out.println("Inserisci il prezzo:");
            double prezzo = scanner.nextDouble();
            scanner.nextLine(); // Consuma il newline rimasto

            if (scelta.equalsIgnoreCase("Smartphone")) {
                System.out.println("Inserisci l'IMEI:");
                String imei = scanner.nextLine();
                System.out.println("Inserisci la quantità di memoria (GB):");
                int memoria = scanner.nextInt();
                scanner.nextLine(); // Consuma il newline rimasto
                Smartphone smartphone = new Smartphone(codice, nome, marca, prezzo, imei, memoria);
                carrello.aggiungiProdotto(smartphone);
            } else if (scelta.equalsIgnoreCase("Televisore")) {
                System.out.println("Inserisci le dimensioni (pollici):");
                int dimensioni = scanner.nextInt();
                scanner.nextLine(); // Consuma il newline rimasto

                System.out.println("Il televisore è smart? (Sì/No):");
                String risposta = scanner.nextLine();
                boolean smart = isSi(risposta);

                Televisore televisore = new Televisore(codice, nome, marca, prezzo, dimensioni, smart);
                carrello.aggiungiProdotto(televisore);
            } else if (scelta.equalsIgnoreCase("Auricolari")) {
                System.out.println("Inserisci il colore:");
                String colore = scanner.nextLine();
                System.out.println("Gli auricolari sono wireless? (Sì/No):");
                String risposta = scanner.nextLine();
                boolean wireless = isSi(risposta);
                Auricolari auricolari = new Auricolari(codice, nome, marca, prezzo, colore, wireless);
                carrello.aggiungiProdotto(auricolari);
            } else {
                System.out.println("Scelta non valida.");
            }
        }

        carrello.stampaCarrello();
    }
}