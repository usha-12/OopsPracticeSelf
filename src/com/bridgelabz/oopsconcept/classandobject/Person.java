package com.bridgelabz.oopsconcept.classandobject;

public class Person {
   private String name; // instance variable
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {// name is a local variable of setName method
        this.name = name;// when given instance variable name and local variable name same then we want to current obj for accessing instance variable
        // this refer to current obj (Person)
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
