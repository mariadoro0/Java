package demo;
import java.util.ArrayList;

import model.*;

public class Piastrellista {
    public static void main(String[] args) {
        ArrayList<Figura> stanze=new ArrayList<>();
        Punto p1=new Punto(0,0);
        Punto p2=new Punto(5,0);
        Punto p3= new Punto(7,0);

        //4 stanze
        Quadrato cucina=new Quadrato(new Segmento(p1,p2));
        Quadrato bagno=new Quadrato(new Segmento(p2,p3));
        Rettangolo camera= new Rettangolo(new Segmento(p1,p2), new Segmento(p1,p3));
        Rettangolo camera2= new Rettangolo(new Segmento(p1,p2), new Segmento(p1,p3));

        stanze.add(cucina);
        stanze.add(bagno);
        stanze.add(camera);
        stanze.add(camera2);

        double superficieTot=0;
        for (Figura stanza:stanze) {
            superficieTot+=stanza.area();
        }
        System.out.println("La superficie dell'appartamento è "+superficieTot+" metri quadri.");
        double superficiePiastrella=0.25;
        double numPiastrelle=superficieTot/superficiePiastrella;
        System.out.println("Servono "+numPiastrelle+" piastrelle.");
    }
}
