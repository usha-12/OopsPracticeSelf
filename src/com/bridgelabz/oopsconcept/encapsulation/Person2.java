package com.bridgelabz.oopsconcept.encapsulation;

public class Person2 {
    public static void main(String[] args) {
        Person1 obj = new Person1();
        System.out.println(obj.getAge());// 0
        System.out.println(obj.getGender()); // null
        System.out.println(obj.getName()); // null
        obj.setAge(10);
        obj.setName("anu");
        obj.setGender("female");
        System.out.println(obj.getAge());
        System.out.println(obj.getGender());
        System.out.println(obj.getName());


    }
}
