package model;

public class LibroPerBambini extends Libro{
    private int etaConsigliata;
    public LibroPerBambini(String titolo, String autore, int etaConsigliata) {
        super(titolo, autore);
    }

    public int getEtaConsigliata(){
        return etaConsigliata;
    }

    public void setEtaConsigliata(int etaConsigliata) {
        this.etaConsigliata = etaConsigliata;
    }

    @Override
    public String getDescrizione(){
        return ("Titolo: "+titolo+"\nAutore: "+autore+"\nEtà Consigliata: "+etaConsigliata);
    }
}
