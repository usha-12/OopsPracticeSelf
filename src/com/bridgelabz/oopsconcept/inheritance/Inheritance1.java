package com.bridgelabz.oopsconcept.inheritance;
class BaseClass1{ // 1. Single Inheritance
    int x = 100;
    void methodBaseClass(){
        System.out.println("Base class method");
    }

}
class SubClass1 extends BaseClass1{
    int y = 200;
    void methodSubClass(){
        System.out.println("Sub class method");
    }

}



public class Inheritance1 {
    public static void main(String[] args) {
        BaseClass1 base = new BaseClass1();
        System.out.println("prent class print = ");
        base.methodBaseClass();
        System.out.println(base.x);
        System.out.println("child  class print = ");
        SubClass1 sub = new SubClass1();
        sub.methodSubClass();
        System.out.println(sub.y);
        sub.x = 20;
        System.out.println(sub.x);

    }

}
