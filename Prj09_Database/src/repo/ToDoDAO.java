package repo;

import java.sql.*;
import java.time.LocalDate;

public class ToDoDAO implements ToDoDAO2 {
    private Connessione conn = new Connessione();
    private Statement statement;
    private PreparedStatement preps;
    private ResultSet rs;

    public void addToDo(String descrizione, LocalDate data, boolean done){
        try {
           preps = conn.getConn().prepareStatement("INSERT INTO todo (descrizione) VALUES (?,?,?)");
           preps.setString(1, descrizione);
           preps.setDate(2, Date.valueOf(data));
           preps.setBoolean(3, done);
           preps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
