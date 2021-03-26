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

    void aggiungiStudente();

    void aggiungiEsame();

    void calcolaMedia();

    void stampaStudenti();

}
