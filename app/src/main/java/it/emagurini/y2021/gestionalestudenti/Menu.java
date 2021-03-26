package it.emagurini.y2021.gestionalestudenti;

public interface Menu {

    /**
     * Stampa a video il Menu dell'applicazione:
     * 1. Aggiungi Studente
     * 2. Aggiungi Esame
     * 3. Calcola media
     * 4. Stampa studenti
     */
    void stampa();

    void esegui();

    /**
     * Aggiunge un nuovo oggetto di tipo Studente
     * in un array di tipo Studente nella classe Classe
     */
    void aggiungiStudente();

    /**
     * Aggiunge un nuovo oggetto di tipo Esame
     * in un array di tipo Esame nella classe Studente
     */
    void aggiungiEsame();

    /**
     *
     */
    void calcolaMedia();

    /**
     *
     */
    void stampaStudenti();

}
