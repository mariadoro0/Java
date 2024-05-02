package model;

public class Segmento {
    private Punto a, b;

    public Segmento(Punto a, Punto b) {     //per costruire un segmento bisogna passare due argomenti di tipo punto
        this.a = a;
        this.b = b;
    }

    public double lunghezza(){
        return Math.sqrt(Math.pow((a.getX()-b.getX()), 2)+Math.pow((a.getY()-b.getY()),2));  //sqrt(x2-x1)^2+(y2-y1)^2) formula per calcolare la distanza tra due punti
    }

    @Override
    public String toString() {
        return "Segmento{" +
                "a=" + a +
                ", b=" + b +
                ", lunghezza="+lunghezza()+
                '}';
    }


}
