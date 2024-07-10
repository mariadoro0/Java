package com.mariadoro;

//single abstract method
@FunctionalInterface
//permette di usare le funzioni lambda
public interface Contratto {
   /*public abstract (implicito)*/ void regola1();

   static void mioMetodo(){
      System.out.println("Funzia");
   }

default void mioMetodo2(){
      System.out.println("Funzia2");
}


}
