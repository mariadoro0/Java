package canedemo;

import cane.Cane;
import cane.CaneGrande;

public class CaneDemo {
	public static void main(String[] args) {
		Cane[] cani= new Cane[10];
		cani[0]=new CaneGrande("bobby", "grande","pastore tedesco", 10);
		cani[1]=new Cane("fuffy","media", "setter", 8);
		cani[2]=new CaneGrande("baby", "grande","rottweiler", 4);
		cani[3]=new Cane("lilly","piccola", "chihuahua", 3);
		cani[4]=new CaneGrande("holly", "grande","pitbull", 10);
		cani[5]=new Cane("pesca","piccola", "bassotto", 1);
		cani[6]=new CaneGrande("tex", "grande","pastore maremmano", 12);
		cani[7]=new Cane("ciccio","media", "jack russel", 8);
		cani[8]=new CaneGrande("polo", "grande","san bernardo", 9);
		cani[9]=new Cane("fiore","piccola", "pincher", 8);
		
//		for(int i=0; i<cani.length;i++) {
//			cani[i].mangia(i);
//		}
		for (Cane cane : cani) {
			if (cane instanceof CaneGrande) {
				cane.mangia(1);
			} else {
				if(cane.eta<8) {
				cane.mangia(50);
				}
				else {
					cane.mangia(30);
				}
			}
		}
	}

}
