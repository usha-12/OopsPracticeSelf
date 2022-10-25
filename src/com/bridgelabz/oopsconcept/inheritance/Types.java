package com.bridgelabz.oopsconcept.inheritance;
class A1{
    int x = 100;
    void methodA1(){
        System.out.println("A1 method");
    }

}
//Single
class B1 extends A1{
    int y = 200;
    void methodB1(){
        System.out.println("B1 method");
    }

}
//Multilevel
class C1 extends B1{
    int z = 300;
    void methodC1(){
        System.out.println("C1 method");
    }

}
//hierarchical
class D1 extends A1{
    int xy = 400;
    void methodD1(){
        System.out.println("D1 method ");
    }

}
public class Types {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.methodA1();
        System.out.println(obj.x);
        System.out.println("Single Inheritance ");
        B1 obj1 = new B1();
        obj1.methodB1();
        System.out.println(obj1.y);
        System.out.println(obj1.x);// B1 class inherit the properties of A1 class that's by access all data from A1 class through obj of B1 class
        obj1.methodA1();
        System.out.println();
        System.out.println("Multilevel Inheritance");
        C1 obj3 = new C1();
        obj3.methodC1();
        System.out.println(obj3.z);
        obj3.methodB1();
        System.out.println(obj3.y);
        obj3.methodC1();
        System.out.println(obj3.x);
        System.out.println("Hierarchical Inheritance");
        D1 obj4 = new D1();
        obj4.methodD1();
        obj4.methodA1();
        System.out.println(obj4.x);
        System.out.println(obj4.xy);

    }

}
