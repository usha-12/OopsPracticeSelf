package com.bridgelabz.oopsconcept.classandobject;

public class RecordStudent {
    public static void main(String[] args) {
        System.out.println("access class with object ");
        Student1 varuna = new Student1();//create a object of class Student1
        varuna.rollNumber = 6587679;
        varuna.name = "Varun";
        varuna.marks = 6.9f;
        System.out.println(varuna.rollNumber);
        System.out.println(varuna.marks);
        System.out.println(varuna.name);

    }

}
/* obj-physical reality / occupy space in memory*/