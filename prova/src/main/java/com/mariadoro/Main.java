package com.mariadoro;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
            Random r = new Random();
            int r1= r.nextInt(5);
            int r2 = r.nextInt(5);
            int r3 = r.nextInt(5);

            boolean flag2 = true;
            boolean flag3 = true;
            do{
                if(r1==r2){
                    r2=r.nextInt(5);
                    flag2=true;
                }else{
                    flag2=false;
                }
                if(r2==r3 || r3==r1){
                    r3=r.nextInt(5);
                    flag3=true;
                } else {
                    flag3=false;
                }


            }while(flag2 && flag3);

            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r3);

        };
    }
