package com.bridgelabz.oopsconcept.encapsulation;

public class Person1 {
    /* Encapsulation -1. binding of data in a single unit
    * 2. achieve data hiding using encapsulation by creating private variables and accessing them through getters and setters
    * 3. we can access the outside of package using getter and setter because getter and setter public method  */
     private String name;
     private String gender;
     private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
