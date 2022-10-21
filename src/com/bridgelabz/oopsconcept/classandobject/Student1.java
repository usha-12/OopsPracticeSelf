package com.bridgelabz.oopsconcept.classandobject;

public class Student1 {//create a class
    int rollNumber;
    String name;
    float marks;
    Student1(){
        this.marks=90.0f;//this replacing with reference variable(student1)
        this.name = "usha";
        this.rollNumber= 6780809;
    }
    void changeName(String nameName){
        name = nameName;
    }
    void greeting(){
        System.out.println("Hello! my name is :" + name);
    }
}
//a class is a named group of properties and function
//combine single entity
//create own data type using class
// is a template of an object
//class is a data type
//Class help us a defining data types
//class logical construct
/*class is a templates of an ous objects obj instance of class, class create data type that you used to create obj when you create obj
* of your class and then create instance of our class */