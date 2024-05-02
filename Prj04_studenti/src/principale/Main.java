package principale;
import model.Studente;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File f= new File("files/studenti.txt");         //file sorgente da leggere
        File d= new File("files/studenti_tostring.html");            //file destinazione da scrivere

        try {
            Scanner input= new Scanner(f);
            PrintWriter pennarello= new PrintWriter(d);
            pennarello.println("<h1>Studenti</h1>");
            pennarello.println("<ul>");

            while(input.hasNextLine()){
                String riga= input.nextLine();
                String[] parole=riga.split(",");   //separa la riga in due sottostringhe considerando la virgola come punto di divisione

                String nome=parole[0];
                String cognome=parole[1];

                Studente s= new Studente(nome, cognome);
                pennarello.println("<li>"+ s.getCognome() +"</li>");
                //System.out.println(s);
            }
            pennarello.println("</ul>");
            pennarello.close();

        } catch (FileNotFoundException e) {                     //gestione errori nel trovare il file
            System.err.println("Mi dispiace, il file non è raggiungibile.");
            System.err.println(e.getMessage());
        }

    }
}
