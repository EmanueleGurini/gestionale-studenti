package it.emagurini.y2021.gestionalestudenti;

import java.util.Scanner;

public class DefaultMenu implements Menu {

    DefaultClasse classe;
    Scanner in;

    public DefaultMenu() {
        this.classe = new DefaultClasse();
        this.in = new Scanner(System.in);
    }


    @Override
    public void stampa() {
        System.out.println("Menu:");
        System.out.println("1. Aggiungi Studente");
        System.out.println("2. Aggiungi Esame");
        System.out.println("3. Calcola Media");
        System.out.println("4. Lista Studenti");
    }

    public void esegui() {
        String option = null;
        do {
            stampa();
            option = in.nextLine();
            if (option.equals("1")) aggiungiStudente();
            if (option.equals("2")) aggiungiEsame();
            if (option.equals("3")) calcolaMediaStudente();
            if (option.equals("4")) stampaStudenti();
        } while (!option.equals("x"));
    }

    @Override
    public void aggiungiStudente() {
        int x = DefaultStudente.getNum();
        System.out.println(x);

        System.out.println("Aggiungi nome:");
        String nome = in.nextLine();
        System.out.print("Aggiungi cognome:");
        String cognome = in.nextLine();
        System.out.println("Aggiungi matricola:");
        int matricola = Integer.parseInt(in.nextLine());
        classe.aggiungi(new DefaultStudente(nome, cognome, matricola));
    }

    @Override
    public void aggiungiEsame() {
        int matr = Integer.parseInt(in.nextLine());
        DefaultStudente studente = classe.cerca(matr);
        if (studente == null) return;

        System.out.println("Inserisci Esame:");
        String esame = in.nextLine();
        System.out.println("Inserisci Voto:");
        int voto = Integer.parseInt(in.nextLine());

        studente.aggiungiEsame(new DefaultEsame(esame, voto));
    }

    @Override
    public void calcolaMediaStudente() {

    }

    @Override
    public void stampaStudenti() {
        for (int i = 0; i < classe.numStudenti(); i++) {
            System.out.println(classe.getStudente(i));
        }
    }
}
