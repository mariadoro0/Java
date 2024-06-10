package repo;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.File;

public class ProvaConnessione {
    public static void main(String[] args) {
        Connessione conn = new Connessione();
        conn.getConn();
        ToDoDAO dao = new ToDoDAO();
       // dao.addToDo();

        File f = new File("W:\\SWD_23-25\\comune\\pokemon.csv");
        try {
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {			//finchè ci sono righe nel file
                String riga = s.nextLine();
                String[] split = riga.split(",");
                if (!riga.startsWith("#")){
                    System.out.println(split[1]);
                    dao.addToDo(split[1], LocalDate.now(), true);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
