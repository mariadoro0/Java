package dipendenti;

public class Impiegato extends Dipendente{
    private int oreLavorate;

    public Impiegato(String nome, String cognome) {
        super(nome, cognome);
        this.ruolo="Impiegato";
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calcolaStipendio() {
        return oreLavorate * pagaBase;
    }
}
