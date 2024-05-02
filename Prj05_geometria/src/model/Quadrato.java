package model;

public class Quadrato extends Rettangolo{    //Quadrato è un caso particolare(figlio) di Rettangolo(genitore)- ereditarietà
    private Segmento lato;

    public Quadrato(Segmento lato) {      //il costruttore non si eredita, quindi ne dobbiamo creare uno
        super(lato, lato);                 //la prima istruzione deve essere super per fare riferimento a Rettangolo
                                            //scriviamo lato, lato per simulare base,altezza del Rettangolo genitore
        this.nome="Quadrato";
        this.lato=lato;
    }//non c'è bisogno di scrivere il perimetro e l'area perchè usa i metodi del Rettangolo

    //se però ci sono dei metodi più efficienti, possiamo fare l'Override del genitore
    @Override
    public double area() {
        return Math.pow(this.lato.lunghezza(), 2);
    }
}
