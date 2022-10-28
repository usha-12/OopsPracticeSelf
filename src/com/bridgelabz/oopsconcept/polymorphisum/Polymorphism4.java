package com.bridgelabz.oopsconcept.polymorphisum;
// while overriding the return types should be same or covariant(parent - child relationship)
class AB{
    Vehicle m1(){
        System.out.println("Class AB m1 ");
        return new Vehicle();
    }

}
class ChildAB extends AB{
    @Override
    Car m1(){
        System.out.println("class ChildAB m1");
       // super.m1();
        return new Car();

    }

}
public class Polymorphism4 {
    public static void main(String[] args) {
        AB obj = new ChildAB();
        obj.m1();

    }
}
