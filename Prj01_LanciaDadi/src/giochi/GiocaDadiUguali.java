package giochi;

public class GiocaDadiUguali {
	public static void main(String[] args) {
		Dado dado1 = new Dado(); // invocazione al metodo costruttore
		Dado dado2 = new Dado();

		final int NUM_LANCI = 1000000000; // indica la versione finale di un qualcosa, se messo su una variabile diventa
									// una costante
		int vittorie = 0;
		int i;
		long start=System.currentTimeMillis();  //prende il tempo in questo momento
		for (i = 0; i < NUM_LANCI; i++) {
			dado1.lancia(); // lancio dei dadi, richiamo al metodo in Dado.java
			dado2.lancia();
			if (dado1.facciaUscita == dado2.facciaUscita) {
				//System.out.println("hai vinto");
				vittorie++;
			} else {
				//System.out.println("non hai vinto");
			}
		}
		long stop= System.currentTimeMillis();			
		System.out.printf("Hai giocato %d volte \n", NUM_LANCI);
		System.out.println("Hai vinto " + vittorie + " volte");
		double percentuale= (double) vittorie/NUM_LANCI*100;
		System.out.println(percentuale);
		System.out.println("Tempo impiegato per l'elaborazione è: " + (stop-start)+ " ms");
	}
}
