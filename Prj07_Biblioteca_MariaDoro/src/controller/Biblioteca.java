package controller;
import model.*;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private ArrayList<Libro> libri;

    public Biblioteca() {
        this.libri = new ArrayList<>();
    }

    public Libro getLibro(int i) {
        return libri.get(i);
    }

    public void addLibro(String titolo, String autore){
        Libro l= new Libro(titolo,autore);
        l.setInPrestito(false);
        this.libri.add(l);
    }
    public void addLibroPerBambini(String titolo, String autore, int etaConsigliata){
        LibroPerBambini l=new LibroPerBambini(titolo, autore, etaConsigliata);
        l.setInPrestito(false);
        l.setEtaConsigliata(etaConsigliata);
        this.libri.add(l);

    }

   public void prestato(Libro l){
        try {
            l.setInPrestito(true);
        }
        catch(Exception e){
            System.out.println("Errore di prestito");
        }
   }
   public void restituito(Libro l){
        l.setInPrestito(false);
   }

   public int totInPrestito(){
        int counter=0;
       for (Libro l: libri) {
           if(l.inPrestito){
               counter++;
           }
       }
       return counter;
   }
   public boolean nessunPrestito(){
        boolean flag=true;
       for (Libro l:libri) {
          if(l.inPrestito){
              flag=false;
              break;
          }
       }
       return flag;
   }

   public boolean inBiblioteca(Libro l){
        boolean exist=false;
       for (Libro b:libri) {
           if(Objects.equals(b.titolo, l.titolo) && Objects.equals(b.autore, l.autore)){
               exist=true;
           }

       }
        return exist;
   }

   public int perBambini(int maxEta){
        int counter=0;
       for (Libro l:libri) {
           if(l instanceof LibroPerBambini){
              if(((LibroPerBambini) l).getEtaConsigliata()>=maxEta){
                  counter++;
              }
           }
       }
       return counter;
   }


}
