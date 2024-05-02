package giochi;

public class Dado {
	int facce=6;
	int facciaUscita=1;
	
	public void lancia() {
		facciaUscita= (int)((Math.random()* facce)+1);			//Math.random da un numero casuale da 0.0 a 0.999999 ma mai 1.0
																//random ritorna un valore double, quindi è un problema se le variabili coinvolte non sono double
																//mettendo il int tra parentesi all'inizio stiamo forzando il tipo (casting)
	}	
}
