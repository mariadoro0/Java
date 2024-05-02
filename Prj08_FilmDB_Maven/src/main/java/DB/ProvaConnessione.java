package DB;

import model.Film;

import java.util.ArrayList;

public class ProvaConnessione {
    public static void main(String[] args) {
        Connessione conn = new Connessione();
        conn.getConn();

        FilmDAO dao = new FilmDAO();
        ArrayList<Film> films = dao.getFilms();

        for (Film f : films){
            System.out.println(f);
        }

    }
}
