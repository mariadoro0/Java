package base;

public class TavolaPitagorica {
    public static void main(String[] args){
        final int RIGHE=10;
        final int COLONNE=10;

        for (int i=1;i<=RIGHE;i++){
            for (int j=1;j<=COLONNE;j++){
                //if(i*j%2==0)
                System.out.print(i*j + "\t");        /*print (diverso da println) non va a capo finche non finisce il ciclo in cui si trova*/
            }
            System.out.println();
        }
    }
}
