package com.mariadoro.libreria;

import com.mariadoro.model.Libro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LibreriaDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/main/resources/files/Biblioteca.csv");
        Scanner input = new Scanner(f);
        List<Libro> listaLibri = new LinkedList<Libro>();
        Set<Libro> setLibri = new HashSet<Libro>();
        Queue<Libro> codaLibri = new LinkedList<Libro>();
        Map<Integer,Libro> mappaLibri = new HashMap<>();


        while(input.hasNextLine()) {
            String riga = input.nextLine();
            String[] split = riga.split(",");
            String titolo = split[2].trim();
            Libro l = new Libro(titolo);
            listaLibri.add(l);
            setLibri.add(l);
            codaLibri.add(l);
            mappaLibri.put(l.getId(), l);
        }


        System.out.println(mappaLibri.values());

    }
}
