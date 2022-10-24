package com.bridgelabz.oopsconcept.classandobject;

import com.bridgelabz.oopsconcept.encapsulation.Person1;

public class Person3 {
    public static void main(String[] args) {
        Person1 obj2 = new Person1();
        System.out.println(obj2.getName());
        System.out.println(obj2.getAge());
        System.out.println(obj2.getGender());
        obj2.setGender("male");
        obj2.setName("abhisekh");
        obj2.setAge(30);
        System.out.println(obj2.getName());
        System.out.println(obj2.getAge());
        System.out.println(obj2.getGender());
    }
}
