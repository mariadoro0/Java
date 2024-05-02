package DB;

import model.Film;

import javax.swing.plaf.nimbus.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FilmDAO {
    private Connessione miaConn= new Connessione();
    private Statement istruzione;
    private ResultSet rs;
    public ArrayList<Film> getFilms(){
        ArrayList films = new ArrayList<Film>();
        try {
            istruzione = this.miaConn.getConn().createStatement();
            rs=istruzione.executeQuery("SELECT * FROM film");
            while(rs.next()){
                Film f = new Film();
                f.setId(rs.getInt("id"));
                f.setAnno(rs.getInt("anno"));
                f.setTitolo(rs.getString("titolo"));
                f.setRegista(rs.getString("regista"));
                f.setRating(rs.getInt("rating"));
                films.add(f);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return films;
    }
}
