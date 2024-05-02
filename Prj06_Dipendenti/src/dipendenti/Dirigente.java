package dipendenti;

public class Dirigente extends Dipendente {
    private int dipendentiAssegnati;

    public Dirigente(String nome, String cognome) {
        super(nome, cognome);
        this.ruolo = "Dirigente";
    }

    public int getDipendentiAssegnati() {
        return dipendentiAssegnati;
    }

    public void setDipendentiAssegnati(int dipendentiAssegnati) {
        this.dipendentiAssegnati = dipendentiAssegnati;
    }

    @Override
    public double calcolaStipendio() {
        return pagaBase * dipendentiAssegnati * 10;
    }
}
