package it.emagurini.y2021.gestionalestudenti;

public class DefaultStudente implements Studente {
    private String nome;
    private String cognome;
    private int matricola;

    public DefaultStudente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
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
}
