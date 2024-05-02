package base;
import java.util.Scanner;
public class SommaDiQuattro {
    public static void main(String[] args){
        int somma= 0;
        final int CICLI=4;

        for (int i=0; i<CICLI;i++) {
            somma+= chiediNumero();
        }
        System.out.println("La somma dei 4 numeri interi è: "+somma);
    }

    private static int chiediNumero() {
        System.out.println("Inserisci un numero intero: ");
        Scanner sc= new Scanner(System.in);

        return sc.nextInt();
    }
}
