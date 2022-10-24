package com.bridgelabz.oopsconcept.classandobject;

public class personAccess {
    public static void main(String[] args) {
        Person obj = new Person();//object of a person class
        //System.out.println(obj.age);
        //System.out.println(obj.name);
        //System.out.println(obj.gender);
        System.out.println(obj.getAge()); // 0
        System.out.println(obj.getGender()); // null
        System.out.println(obj.getName()); // null
        obj.setAge(20);
        obj.setGender("male");
        obj.setName("Mohini");
        System.out.println(obj.getAge()); //20
        System.out.println(obj.getGender()); //male
        System.out.println(obj.getName()); //mohini


    }
}
