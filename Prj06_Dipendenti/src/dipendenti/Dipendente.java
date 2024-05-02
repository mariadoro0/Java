package dipendenti;

public abstract class Dipendente {

    private static int matricolatore = 1;               //quando matricolatore viene incrementato, qua diventa =2

    private int nMatricola;
    private String nome;
    private String cognome;
    protected String ruolo;             //disponibile solo ai discendenti della classe dipendente
    protected double pagaBase;

    public Dipendente(String nome, String cognome) {
        this.nMatricola = matricolatore++;              //si incrementa ogni volta che viene aggiunto un dipendente
        this.nome = nome;
        this.cognome = cognome;
        this.pagaBase = 9;
    }

    public abstract double calcolaStipendio();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dipendente{");
        sb.append("nMatricola=").append(nMatricola);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", cognome='").append(cognome).append('\'');
        sb.append(", ruolo='").append(ruolo).append('\'');
        sb.append(", stipendio= ").append(calcolaStipendio());
        sb.append('}');
        return sb.toString();
    }
}
