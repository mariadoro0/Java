package model;

public class Rettangolo extends Figura {
    private Segmento base, altezza;

    public Rettangolo(Segmento base, Segmento altezza) {
        this.nome="Rettangolo";
        this.base = base;
        this.altezza = altezza;
    }

    public double perimetro(){
        return 2*(base.lunghezza()+ altezza.lunghezza());
    }
    public double area(){
        return base.lunghezza()* altezza.lunghezza();
    }

}
