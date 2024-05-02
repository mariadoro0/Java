package cane;

public class Cane {
	String nome;
	String taglia;
	String razza;
	public int eta;
	
	
	
	public Cane(String nome, String taglia, String razza, int eta) {
		this.nome = nome;
		this.taglia = taglia;
		this.razza = razza;
		this.eta = eta;
		System.out.println("Oggetto di tipo cane costruito");
	}
 
	public void mangia(int num) {
		System.out.println("mangia "+num+" crocchettine");
		System.out.println("gnam gnam");
		
	}
	
	public String stampaCartellino() {
		String output= "Cane: \n"+nome +"\n"+taglia+"\n"+razza+"\n"+eta+"\n";
		return output;
	}
	
}
