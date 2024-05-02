package database;

import model.Film;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FilmDAO {
    private Connessione c;

    private Statement stat;

    private ResultSet rs;

    public FilmDAO() {
        this.c= new Connessione();
        c.connetti();
    }
    public ArrayList<Film> getFilm(){
        ArrayList<Film> films= new ArrayList<>();
        try {
            this.stat= c.getConn().createStatement();
            this.rs=this.stat.executeQuery("SELECT * FROM film");
            while (this.rs.next()){
                Film f= new Film();
                f.setId(rs.getInt("film_id"));
                f.setTitle(rs.getString("title"));
                f.setDescription(rs.getString("description"));
                f.setReleaseYear(rs.getInt("release_year"));
                f.setLanguageId(rs.getInt("language_id"));
                f.setGenreId(rs.getInt("genre_id"));

                films.add(f);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return films;
    }


}
