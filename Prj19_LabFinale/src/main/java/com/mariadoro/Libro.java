package com.mariadoro;

public class Libro implements Comparable<Libro>{
    public String titolo;
    public int pagine;

    public Libro(String s) {
        this.titolo = s;
    }

    @Override
    public int compareTo(Libro nuovolibro) {
        return this.pagine- nuovolibro.pagine;
    }
}
