package com.bridgelabz.oopsconcept.classandobject;

public class StudentProfile {
    public String name;// instance variable
    /*Why use Instance Variable in a class - because It has many copies so every object has its own personal copy of the instance variable*/
    public String clasName;
    public String phoneNumber;
    public int marks;
    public int totalMarks;
    public String subject;
    public StudentProfile (){// constructor has a same name as a class name
        System.out.println("StudentProfile() constructor ");
    }
    static final String INSTITUTE = "Brideglabz";//final keyword when used with a variable,it is value can't be change
    public static void main(String[] args) {
        StudentProfile  student1 = new StudentProfile ();//object has its own personal copy of the instance variable
        //The object is an instance of a class
        System.out.println("=========print Null values========");
        System.out.println("Student First :");
        System.out.println(student1.name);
        System.out.println(student1.clasName);
        System.out.println(student1.phoneNumber);
        System.out.println(student1.marks);
        System.out.println(student1.totalMarks);
        System.out.println(student1.subject);
        student1.name = "Anuj Rathi";//given value (object.variable)
        student1.clasName="Class 12th";
        student1.phoneNumber="66687897989880";
        student1.marks = 80;
        student1.totalMarks = 100;
        student1.subject = "math";
        System.out.println("==========print value=============");
        System.out.println(student1.INSTITUTE);
        System.out.println(student1.name);
        System.out.println(student1.clasName);
        System.out.println(student1.phoneNumber);
        System.out.println(student1.subject);
        System.out.println(student1.marks);
        System.out.println(student1.totalMarks);
        StudentProfile student2 = new StudentProfile();//default constructor
        System.out.println("=========Create second object for class=======");
        System.out.println("Student second :");
        System.out.println(student1.INSTITUTE);
        student2.subject = "Math";
        student2.marks = 70;
        student2.totalMarks = 100;
        student2.phoneNumber = "8667798789";
        student2.clasName = "12h";
        student2.name = "Amit";
        System.out.println(student2.name);// accessing member through reference (student2) variable
        System.out.println(student2.clasName);
        System.out.println(student2.phoneNumber);
        System.out.println(student2.marks);
        System.out.println(student2.totalMarks);
    }

}
// we can create multiple object with in a one class because class is a blueprint of object
// class contain a properties of object
// we want to create one class this name is student and we want to show data of multiple student so we can create a multiple object in class
//just like student1 and student2 so on....
//