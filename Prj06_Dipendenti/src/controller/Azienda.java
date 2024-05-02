package controller;

import dipendenti.*;                //importo tutte le classi del package

import java.util.ArrayList;


public class Azienda {
    private String nomeAzienda;
    private ArrayList<Dipendente> dipendenti;

    public Azienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
        this.dipendenti = new ArrayList<>();
    }

    public void addDipendente(String nome, String cognome, String ruolo){
        switch(ruolo){
            case "I":
                Impiegato i = new Impiegato(nome, cognome);
                i.setOreLavorate(100);
                this.dipendenti.add(i);
            break;

            case "F":
                Fattorino f = new Fattorino(nome, cognome);
                f.setNumConsegne(200);
                this.dipendenti.add(f);
                break;

            case "D":
                Dirigente d = new Dirigente(nome, cognome);
                d.setDipendentiAssegnati(15);
                this.dipendenti.add(d);
            break;

            default:
                System.out.println("Non valido.");
        }

    }

    public ArrayList<Dipendente> getDipendenti() {
        return dipendenti;
    }

    public ArrayList<Fattorino> getFattorini() {
        ArrayList<Fattorino> fattorini= new ArrayList<>();
        for (Dipendente d : dipendenti) {
            if (d instanceof Fattorino) fattorini.add((Fattorino) d);
        }
        return fattorini;
    }
}
