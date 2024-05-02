package ausiliari;
import java.util.Scanner;

public class PietraCartaForbici {
    public static void main (String[] args) {
        System.out.println(menu());
        String sceltaUmano= chiediUmano();
        String sceltaPC= chiediPC();

        System.out.println("Umano: "+sceltaUmano);
        System.out.println("Macchina: "+sceltaPC);

        assert sceltaUmano != null;
        String result = valuta(sceltaUmano, sceltaPC);
        System.out.println("Il risultato è: "+result);
    }

    private static String menu() {
        return "Scegli tra \n P=pietra\nC=carta\nF=forbice";
    }

    private static String valuta(String sceltaUmano, String sceltaPC) {
        String result= null;
        if (sceltaUmano.equalsIgnoreCase(sceltaPC))
            result="PAREGGIO";
        else {
            switch (sceltaUmano){
                case "P":
                    if(sceltaPC.equalsIgnoreCase("F"))
                        result="vince UMANO";
                    else
                        result="vince PC";
                    break;
                case "F":
                    if(sceltaPC.equalsIgnoreCase("C"))
                        result="vince UMANO";
                    else
                        result="vince PC";
                    break;
                case "C":
                    if(sceltaPC.equalsIgnoreCase("P"))
                        result="vince UMANO";
                    else
                        result="vince PC";
                    break;

                default:
                    result="Non vale!";
                    break;
            }
        }
        return result;
    }

    private static String chiediPC() {
        String scelta="P";
        double casuale=Math.random();
        if (casuale<0.33)
            scelta="C";
        else if (casuale<0.66)
            scelta="F";

        return scelta;
    }
    private static String chiediUmano() {
        System.out.println("Scrivi una sola lettera:");
        Scanner input = new Scanner(System.in);
        String temp = input.next();
        return temp;
    }
}
