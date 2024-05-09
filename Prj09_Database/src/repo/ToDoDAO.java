package repo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class ToDoDAO implements ToDoDAO2 {
	private Connessione conn = new Connessione();
	private Statement statement;
	private PreparedStatement preps;			//prepari l'istruzione e dopo colleghi i valori
	private ResultSet rs;
	
	public void addToDo(String descrizione, LocalDate data, boolean done) {
		try {
			preps = conn.getConn().prepareStatement("INSERT INTO todo (descrizione, data, done) VALUES (?, ?, ?)");
			preps.setString(1, descrizione);
			preps.setDate(2, Date.valueOf(data) );
			preps.setBoolean(3, done);
			preps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
