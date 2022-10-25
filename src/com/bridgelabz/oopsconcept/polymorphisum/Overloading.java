package com.bridgelabz.oopsconcept.polymorphisum;
/*1. Polymorphism - poly, money, morphism => many form
* 2. Two Types of Polymorphism
* 1. RunTime
* 2. CompileTime*/


/*1. CompileTime - the polymorphism is achieved using overloading*
 over-Loading => 1. Two or more methods having same name and different number of
   arguments or different types of arguments is called overloading
   2. Return type does not play a role in overloading
   */


/*method Signature => method name along with arguments is called method
* signature eg-m1(int x, int y)*/
public class Overloading {
    void m1(){
        System.out.println("first method");

    }
    void m1(int x){
        System.out.println("second method =>"+x);

    }
    void m1(float x){
        System.out.println("third method =>"+x);

    }
    void m1(float x, int y){
        System.out.println("fourth method =>"+x +y);

    }
    void m1(String s){
        System.out.println("fifth method =>"+s);

    }
    void m1(int x, int y){
        System.out.println("six method =>"+x +y);

    }
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.m1();
        obj.m1(100);
        obj.m1(1.2f);
        obj.m1(10.2f,10);
        obj.m1(20,10);
        obj.m1("usha");

    }
}
