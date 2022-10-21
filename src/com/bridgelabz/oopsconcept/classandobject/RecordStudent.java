package com.bridgelabz.oopsconcept.classandobject;

public class RecordStudent {
    public static void main(String[] args) {
        System.out.println("access class with object ");
        Student1 student1 = new Student1();//create a object of class Student1
       System.out.println(student1.rollNumber);
       System.out.println(student1.marks);
       System.out.println(student1.name);
    student1.greeting();
    student1.changeName("this is my name");
    }

}
/* obj-physical reality / occupy space in memory*/