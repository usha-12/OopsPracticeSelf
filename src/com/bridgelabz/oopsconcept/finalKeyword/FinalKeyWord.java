package com.bridgelabz.oopsconcept.finalKeyword;
// final class Parent1{ - class can not be inherited


    // method can not be overridden
  /* final void m1(){
        System.out.println("method parent");
    }

   */

//}
//class Child1 extends Parent1{
   // @Override
   // void m1(){
       // System.out.println("method child ");
    //}

//}
public class FinalKeyWord {
    final int x = 100;
    static final int y =200;

    public static void main(String[] args) {
        FinalKeyWord obj = new FinalKeyWord();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}
