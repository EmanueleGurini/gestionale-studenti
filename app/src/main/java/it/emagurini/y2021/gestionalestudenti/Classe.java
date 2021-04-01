package it.emagurini.y2021.gestionalestudenti;

public interface Classe {

    /**
     * Aggiunge un nuovo studente all'array studenti nella classe Classe
     *
     * @param studente dichiara una variabile di tipo Studente
     */
    void aggiungi(DefaultStudente studente);

    int numStudenti();

    DefaultStudente getStudente(int i);

}
