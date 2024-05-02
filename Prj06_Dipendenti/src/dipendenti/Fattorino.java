package dipendenti;

public class Fattorino extends Dipendente{

    private int numConsegne;

    public Fattorino(String nome, String cognome) {
        super(nome, cognome);
        this.ruolo = "Fattorino";
    }

    public int getNumConsegne() {
        return numConsegne;
    }

    public void setNumConsegne(int numConsegne) {
        this.numConsegne = numConsegne;
    }

    @Override
    public double calcolaStipendio() {
        return numConsegne * pagaBase;
    }
}
