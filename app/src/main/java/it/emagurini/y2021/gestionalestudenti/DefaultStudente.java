package it.emagurini.y2021.gestionalestudenti;

public class DefaultStudente implements Studente {
    private static int cont = 0;

    private String nome;
    private String cognome;
    private int matricola;

    DefaultEsame[] esami;
    private int nEsami;


    public DefaultStudente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;

        this.esami = new DefaultEsame[100];
        this.nEsami = 0;
        cont++;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String getCognome() {
        return this.cognome;
    }

    @Override
    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public int getMatricola() {
        return this.matricola;
    }

    public void aggiungiEsame(DefaultEsame esame) {
        this.esami[nEsami] = esame;
        this.nEsami++;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.cognome + " " + this.matricola;
    }

    public static int getNum() {
        return cont;
    }
}
