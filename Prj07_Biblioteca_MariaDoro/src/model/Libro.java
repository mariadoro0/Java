package model;

import java.util.Objects;

public class Libro {
    public String titolo;
    public String autore;
    public boolean inPrestito;

public Libro(String titolo, String autore) {
    this.titolo=titolo;
    this.autore=autore;
    this.inPrestito=false;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setInPrestito(boolean inPrestito) {
        this.inPrestito = inPrestito;
    }

    public boolean isInPrestito(){
    return inPrestito;
    }

    public String getDescrizione(){
    return ("Titolo: "+titolo+"\nAutore: "+autore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titolo, libro.titolo) && Objects.equals(autore, libro.autore);
    }

}
