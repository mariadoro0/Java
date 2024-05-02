package stringhe;

public class ProvaStringhe {
    public static void main(String[] args){
        String s1="ciao";
        String s2= new String("ciao");
        String s3="ciao";

        System.out.println(s1==s2);          //restituisce false, perchè le due stringhe sebbene abbiano lo stesso contenuto, sono in due posti diversi
        System.out.println(s1==s3);         //falso positivo, non confrontare con ==, java non crea un nuovo oggetto stringa ma fa puntare s3 a s1 e quindi risultano nello stesso posto
                                            //per confrontare un oggetto si usa .equals
    }
}
