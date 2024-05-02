package view;

import controller.Biblioteca;
import model.Libro;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca b= new Biblioteca();
        b.addLibro("La Divina Commedia", "Dante");
        b.addLibro("I Promessi Sposi","Manzoni");
        b.addLibroPerBambini("Barzellette","Geronimo Stilton",6);
        b.addLibroPerBambini("Zio pera","Pippo Baudo",6);

        Libro l2= new Libro ("La Divina Commedia", "Dante");
        b.addLibro(l2.titolo, l2.autore);


        System.out.println( b.perBambini(5));
        System.out.println(b.inBiblioteca(b.getLibro(0)));
        System.out.println((b.getLibro(4)).getDescrizione());
        b.prestato(b.getLibro(4));
        System.out.println(b.nessunPrestito());
        System.out.println(b.totInPrestito());

    }


}
