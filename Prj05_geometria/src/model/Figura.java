package model;

public abstract class Figura {
    protected String nome;

    //dichiariamo i metodi perimetro e area per poterli chiamare nel main.
    //in base al tipo di figura, calcola il perimetro e l'area dalle formule nella classe
    public abstract double perimetro();     //quando una classe contiene un metodo astratto, l'intera classe va dichiarata astratta
                                            //da una classe astratta non si possono più istanziare oggetti (non posso fare new Figura)
                                            //serve solo ad essere estesa, e i metodi diventano obbligatori per ogni classe figlia
    public abstract double area();

    @Override
    public String toString() {
        return "Figura  {" +
                " Nome='" + nome + '\'' +
                "  Perimetro="+perimetro()+
                "  Area= "+area()+
                '}';
    }
}
