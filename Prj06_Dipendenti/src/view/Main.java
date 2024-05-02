package view;
import controller.Azienda;
import dipendenti.Dipendente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Azienda a1= new Azienda("swd");
        a1.addDipendente("alessandro","aliberti","F");
        a1.addDipendente("edoardo","berardengo","I");
        a1.addDipendente("maria","doro","D");
        a1.addDipendente("mauro","pacenti","D");
        a1.addDipendente("fabio","meloni","I");
        a1.addDipendente("gallo","samuele","I");

        ArrayList<Dipendente> dipendenti = a1.getDipendenti();
        for (Dipendente dipendente: dipendenti) {
            System.out.println(dipendente);
        }


    }
}
