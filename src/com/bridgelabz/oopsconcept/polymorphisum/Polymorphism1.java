package com.bridgelabz.oopsconcept.polymorphisum;

class Vehicle{
    int x = 10;
    void m1(){
        System.out.println("method m1 ");
    }
}
class Car extends Vehicle{
    int y =20;
    void m2(){
        System.out.println("method m2");
    }
}
class Test{
    void methodA(Car car){
        System.out.println("methodA (car)");
    }
    void methodB(int x){
        System.out.println("methodB ");
    }
    void methodC(Vehicle vehicle){
        System.out.println("methodC (vehicle)");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Test test = new Test();
        test.methodB(100);
        Car car = new Car();
        test.methodA(car);
        Vehicle vehicle = new Vehicle();
        test.methodC(vehicle);
        Vehicle ref = new Car();
        test.methodA(car);
        test.methodC(vehicle);
        test.methodC(ref);

    }
}
