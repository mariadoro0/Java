package model;

public class Triangolo extends Figura{
    private Punto a,b,c;
    private Segmento ab,ac,bc;

    public Triangolo(Punto a, Punto b, Punto c) {
        this.nome="Triangolo";
        this.a = a;
        this.b = b;
        this.c = c;
        this.ab= new Segmento(a,b);
        this.bc= new Segmento(b,c);
        this.ac= new Segmento(a,c);
    }

    public double perimetro(){
        return ab.lunghezza()+bc.lunghezza()+ac.lunghezza();
    }

    public double area(){
        double sp=perimetro()/2;
        return Math.sqrt(sp*(sp-ab.lunghezza())*(sp-ac.lunghezza())*(sp-bc.lunghezza()));         //formula di Erone per l'area senza altezza

    }




}
