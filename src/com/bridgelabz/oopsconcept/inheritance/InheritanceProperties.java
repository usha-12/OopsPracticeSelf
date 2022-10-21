package com.bridgelabz.oopsconcept.inheritance;

public class InheritanceProperties {

    //1. inherit the properties from parent class to child class is called inheritance
    //2. we achieve inheritance using extends keyword
    //3. Inheritance --> IS-A Relationship
    //4. example--> monkey IS-A Animal, Car IS-A vehicle

    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        System.out.println(parent.x);
        parent.baseMethod1();
        System.out.println("======================================");
        SubClass child = new SubClass();
        System.out.println(child.y);
        child.subMethod1();
        System.out.println(child.x);
        child.baseMethod1();
        System.out.println("==============================================");
        Animal prent1 = new Animal();
        prent1.age = 10;
        prent1.color = "black";
        prent1.name = "cat";
        System.out.println(prent1.age);
        System.out.println(prent1.color);
        System.out.println(prent1.name);
        prent1.animalMethod();
        System.out.println("===============================================");
        Monkey child1 = new Monkey();
        child1.age=20;
        child1.color="white";
        child1.name="monkey";
        child1.animalMethod();
        System.out.println(child1.age);
        System.out.println(child1.color);
        System.out.println(child1.name);
        System.out.println(child1.y);
        System.out.println("================================================");
        Cat child2 = new Cat();
        child2.age = 30;
        child2.color = "Brown";
        child2.name = "cat";
        System.out.println(child2.age);
        System.out.println(child2.name);
        System.out.println(child2.color);
        System.out.println(child2.y);
        child2.animalMethod();
        child1.animalMethod();
        child2.catMethod();
        System.out.println("================================================");
        Lion child3 = new Lion();
        child3.age = 40;
        child3.color="black";
        child3.name = "Lion";
        System.out.println(child3.age);
        System.out.println(child3.color);
        System.out.println(child3.name);
        System.out.println(child3.y);
        child3.animalMethod();
        child2.animalMethod();
        child1.animalMethod();
        child1.monkeyMethod();
        System.out.println(child1.name);

    }
}
class BaseClass{
    int x = 100;
    void baseMethod1(){
        System.out.println("parent  class method");
    }
}
class SubClass extends BaseClass{
    int y = 200;
    void subMethod1(){
        System.out.println("child class method");
    }
}
    class Animal{//parent class
        String color ;
        int age ;
        String name;
        int y = 300;
        void animalMethod(){
            System.out.println("animal class method (parent class)");
        }
    }
    class Monkey extends Animal{
    void monkeyMethod(){
        System.out.println("monkey method");
        int x = 500;
    }


    }
    class Cat extends Animal{
    void catMethod(){
        System.out.println("cat class method");
    }

    }
    class Lion extends Animal{
    void lionMethod(){
        System.out.println("lion method class");
    }

    }




