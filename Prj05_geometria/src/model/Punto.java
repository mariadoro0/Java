package model;

public class Punto {
    private int x,y;

    //overload
    public Punto() {
        this.x=0;
        this.y=0;
    }

    public Punto(int x, int y){         //si possono dichiarare metodi con stesso nome ma con firma diversa (ciò che sta dentro le parentesi)
        super();
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x){
        this.x=x;

    }

    public String toString(){
    return (" "+x+","+y+" ");
    }
}
