package it.emagurini.y2021.gestionalestudenti;

import java.util.Scanner;

public class DefaultMenu implements Menu {

    @Override
    public void stampa() {
        System.out.println("Menu:");
        System.out.println("1. Aggiungi Studente");
        System.out.println("2. Aggiungi Esame");
        System.out.println("3. Calcola Media");
        System.out.println("4. Lista Studenti");
    }

    public void esegui() {
        Scanner in = new Scanner(System.in);
        String option = null;
        do {
            stampa();
            option = in.nextLine();
            if (option.equals("1")) aggiungiStudente();
            if (option.equals("2")) aggiungiEsame();
            if (option.equals("3")) calcolaMedia();
            if (option.equals("4")) stampaStudenti();
        } while (!option.equals("x"));
    }

    @Override
    public void aggiungiStudente() {

    }

    @Override
    public void aggiungiEsame() {

    }

    @Override
    public void calcolaMedia() {

    }

    @Override
    public void stampaStudenti() {

    }
}
