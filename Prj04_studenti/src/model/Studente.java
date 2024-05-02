package model;

public class Studente {

    private static int counter=1;    //static=relativo alla classe, non dipende dall'oggetto

    //proprietà degli oggetti
    private int id;
    private String nome;
    private String cognome;



    public Studente(String nome, String cognome) {
        this.nome=nome;
        this.cognome=cognome;
        this.id=Studente.counter++;     //id=proprietà dello studente, counter=proprietà della classe

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
