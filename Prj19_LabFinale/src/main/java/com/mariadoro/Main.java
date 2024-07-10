package com.mariadoro;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Contratto cc = () -> System.out.println("Cazzi");

        Libro l1 = new Libro();
        l1.titolo = "zio robot";
        l1.pagine = 231;

        Libro l2 = new Libro();
        l2.titolo = "java";
        l2.pagine = 500;

        Libro l3 = new Libro();
        l3.titolo = "palle";
        l3.pagine = 133;

        List<Libro> libri = new ArrayList<>(List.of(l1,l2,l3));
        Comparator<Libro> c = new Comparator<Libro>() {

            @Override
            public int compare(Libro o1, Libro o2) {
                return o1.titolo.compareTo(o2.titolo);
            }
        };

      // Collections.sort(libri,(libro1,libro2)->libro1.titolo.compareTo(libro2.titolo));
        libri
                .stream()
                .filter(l -> l.pagine > 200)
                .sorted((ll1,ll2)->ll1.titolo.compareTo(ll2.titolo))
                .collect(Collectors.toList());

    }
}