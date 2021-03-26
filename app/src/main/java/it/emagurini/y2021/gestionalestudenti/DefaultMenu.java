package it.emagurini.y2021.gestionalestudenti;

public class DefaultMenu implements Menu {

    @Override
    public void stampa() {
        System.out.println("Menu:");
        System.out.println("1. Aggiungi Studente");
        System.out.println("2. Aggiungi Esame");
        System.out.println("3. Calcola Media");
        System.out.println("4. Lista Studenti");
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
