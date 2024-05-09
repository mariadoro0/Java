package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
    private final String URL="jdbc:mariadb://localhost:3306/top_films";
    private final String USER="root";
    private final String PASS="";

    private Connection conn = null;

    private void connetti(){
        try {
            this.conn= DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connesso al DB.");
        } catch (SQLException e) {
            System.err.println("Connessione non riuscita."+e.getMessage());
        }
    }
    public Connection getConn(){
        if (conn == null){                              //Si connette solo se non c'è gia una connessione attiva
            connetti();
        }
        return conn;
    }

}