package it.emagurini.y2021.gestionalestudenti;

public class DefaultClasse implements Classe {

    Studente[] studenti;
    int nStudenti;

    public DefaultClasse() {
        this.studenti = new Studente[100];
        this.nStudenti = 0;
    }

    @Override
    public void aggiungi(Studente studente) {
       this.studenti[nStudenti] = studente;
       this.nStudenti++;
    }
}
