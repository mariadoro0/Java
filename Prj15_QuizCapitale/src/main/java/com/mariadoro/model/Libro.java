package com.mariadoro.model;

public class Libro {
    private static int cnt = 1;
    private int id;

    private String title;
    private int pages;
    private double price;

    public Libro() {
        this.id = cnt++;
    }

    public Libro(String title) {
        this();
        this.title = title.toLowerCase();
    }

    public Libro(String title, int pages) {
        this(title);
        this.pages = pages;
    }

    public Libro(String title, int pages, double price) {
        this(title,pages);
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
