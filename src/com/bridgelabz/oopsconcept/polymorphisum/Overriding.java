package com.bridgelabz.oopsconcept.polymorphisum;
                    //Overriding
/*1. whenever we do inheritance, if we are not satisfied with the parent class method implementation, we can override that
* method and provide our own implementation in the child class
* 2. method signature should be same while overriding  */
class Base1{
    int x = 10;
    void m1(){
        System.out.println("Base class method m1");
    }

}
class Sub1 extends Base1{
    int y =100;
    void m2(){
        System.out.println("method m2");
    }

    @Override
    void m1() {
        System.out.println("sub1 class method m1");// override base class method
    }
}
public class Overriding {
    public static void main(String[] args) {
        Sub1 obj = new Sub1();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.m2();
        obj.m1();

        Base1 obj2 = new Sub1(); // parent reference can't access child class properties
        System.out.println(obj2.x);
        obj2.m1();


    }
}
