package model;

import util.Segreteria;

public class Impiegato {
    private String nome, cognome, id;
    private int annoNascita, stipendio;

    public  Impiegato(String nome, String cognome, int annoNascita) {
        this.nome= nome;
        this.cognome= cognome;
        this.annoNascita= annoNascita;
        this.stipendio=1000;
        this.id= Segreteria.creaId(this.nome, this.cognome, this.annoNascita);
    }

    //Hetter e Setter Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter e Setter Cognome
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    //Getter e Setter annoNascita
    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    //Getter e Setter Stipendio
    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    //Getter e Setter ID
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "impiegato{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id='" + id + '\'' +
                ", annoNascita=" + annoNascita +
                ", stipendio=" + stipendio +
                '}';
    }
}
