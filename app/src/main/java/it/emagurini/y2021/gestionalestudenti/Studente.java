package it.emagurini.y2021.gestionalestudenti;

public interface Studente {

    /**
     *
     * @param esame
     */
    //void aggiungi(Esame esame);

    /**
     *
     * @return
     */
    String getNome();

    /**
     *
     * @param nome
     */
    void setNome(String nome);

    /**
     *
     * @return cognome
     */
    String getCognome();

    /**
     *
     * @param cognome
     */
    void setCognome(String cognome);

    /**
     *
     * @return
     */
    int getMatricola();

    /**
     *
     * @param matricola
     */
    void setMatricola(int matricola);
}
