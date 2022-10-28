package com.bridgelabz.oopsconcept;

public class ObjectClass {
    public void m1(){
        System.out.println("m1");
    }
    public static void main(String[] args) {
        Object obj = new Object();
        obj.getClass();
        obj.equals(1);
        ObjectClass obj1 = new ObjectClass();
        obj1.m1();
        obj1.getClass(); // parent class inherit child class
    }

}
