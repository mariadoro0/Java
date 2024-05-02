package base;

import java.util.Arrays;

public class Swap {
    public static void main(String[] agrs){
        int[] voti= {25,21,30,24,18};
        Arrays.sort(voti);
        for (int i=0;i<voti.length;i++){
            System.out.println(voti[i]);
        }
        System.out.println("------------");
        for (int voto: voti){
            System.out.println(voto);
        }
        System.out.println("------------");
        for (int i=(voti.length-1);i>=0;i--){
            System.out.println(voti[i]);
        }
    }


    private static int[] swap(int[] a) {
        int[] scambiati=new int[2];
        int tmp=a[1];
        a[1]=a[0];
        a[0]=tmp;
        return a;
    }
}
