package repo;

import java.time.LocalDate;

public interface ToDoDAO2 {
	//proprietà public final per definizione
	String FIND_ALL="SELECT * from todo";
	String ADD="INSERT INTO todo (descrizione, data, done) VALUES (?,?,?)";
	
	//metodi public e abstract per definizione
	void addToDo(String desc, LocalDate data, boolean done);		
}
