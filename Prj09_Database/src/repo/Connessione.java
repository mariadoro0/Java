package repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	private final String URL="jdbc:mariadb://localhost:3306/java";
	private final String USERNAME="root";
	private final String PASS="";
	
	private Connection conn;
	
	public Connection getConn() {
		if (conn == null) {
			connetti();
		}
		return conn;
	}
	
	private void connetti() {
		try {
			conn=DriverManager.getConnection(URL, USERNAME, PASS);
			System.out.println("Sei connesso.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
