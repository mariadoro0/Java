package view;
import controller.Azienda;
import model.Impiegato;

public class Main {
    public static void main(String[] args){
        Azienda toyota=new Azienda(4);
        Azienda mercedes=new Azienda(3);

        Impiegato i1= new Impiegato("Paolo","Rossi",2000);
        toyota.addImpiegato(i1);
        Impiegato i2= new Impiegato("Mario","Rossi",2002);
        toyota.addImpiegato(i2);
        Impiegato i3= new Impiegato("Maria","Verdi",2001);
        i3.setStipendio(1500);
        toyota.addImpiegato(i3);

        toyota.addImpiegato(new Impiegato("Giovanna","D'arco",1998));
        //toyota.addImpiegato(new Impiegato("Marco","Polo",1996));
        //toyota.addImpiegato(new Impiegato("Francesco","Totti",1991));

        System.out.println(toyota.getDipendenti());
        System.out.println("Totale stipendi: ");
        System.out.println(toyota.calcolaStipendioTot());
    }
}
