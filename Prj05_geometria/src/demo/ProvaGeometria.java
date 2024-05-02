package demo;

import model.*;

import java.util.ArrayList;

public class ProvaGeometria {
    public static void main(String[] args) {
        System.out.println("Programma Geometria Piana");
        Punto a = new Punto(3,2);
        Punto b= new Punto(7,2);
        Punto c= new Punto(3,5);

        Segmento ab= new Segmento(a,b);
        Segmento bc= new Segmento(b,c);
        Segmento ac= new Segmento(a,c);

        System.out.println(ab);
        System.out.println(bc);
        System.out.println(ac);

        Triangolo t= new Triangolo(a,b,c);
        System.out.println(t);

        Rettangolo r= new Rettangolo(ab,ac);
        System.out.println(r);

        Quadrato q= new Quadrato(ab);
        System.out.println(q);
        //forme uguali di scriverlo, essendo Quadrato un'estensione di Rettangolo
        //Rettangolo q2= new Quadrato(ab);
       // System.out.println(q2);

        //Figura r2= new Rettangolo(bc,ac);       //dichiarando come Figura, non ereditiamo i metodi specifici delle varie figure
        //System.out.println(r2);

        ArrayList<Figura> figure= new ArrayList<>();      //creiamo un array di figure e le aggiungiamo con add
        figure.add(t);
        figure.add(r);
        figure.add(q);

        System.out.println("\n");
        for (Figura figura:figure) {
            /*if (figura instanceof Quadrato){
                System.out.println("è un quadrato!");
                ((Quadrato)figura).area();          //Cast forzato per far diventare figura di tipo Quadrato e per poterne calcolare l'area
                System.out.println("Area: "+((Quadrato)figura).area());          //Cast forzato per far diventare figura di tipo Quadrato e per poterne calcolare l'area

            }*/
            System.out.println("Perimetro: "+figura.perimetro());
        }

    }
}
