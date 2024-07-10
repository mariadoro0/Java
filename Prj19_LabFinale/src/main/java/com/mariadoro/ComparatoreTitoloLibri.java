package com.mariadoro;

import java.util.Comparator;

public class ComparatoreTitoloLibri implements Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.titolo.compareTo(l2.titolo);
    }
}
