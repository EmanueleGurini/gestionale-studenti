package it.emagurini.y2021.gestionalestudenti;

public class DefaultClasse implements Classe {

    private DefaultStudente[] studenti;
    private int nStudenti;

    public DefaultClasse() {
        this.studenti = new DefaultStudente[100];
        this.nStudenti = 0;
    }

    @Override
    public void aggiungi(DefaultStudente studente) {
       this.studenti[nStudenti] = studente;
       this.nStudenti++;
    }

    @Override
    public int numStudenti() {
        return this.nStudenti;
    }

    @Override
    public DefaultStudente getStudente(int i) {
        return this.studenti[i];
    }
}
