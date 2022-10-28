package com.bridgelabz.oopsconcept.abstraction;
interface Interface1{
    int x = 100;
    void method1();
    void method2(int x);
    void method3();
    default void defaultMethod(){
        privateMethod();//private method only can call in default method

    }
    static void staticMethod(){

    }
    private void privateMethod(){

    }
}
interface Interface2{
    int y =200;
    void method11();
    void method1();
    void method22();
    void method33();
}
class Impl1 implements Interface1,Interface2{

    @Override
    public void method11() {
        System.out.println("method11");

    }

    @Override
    public void method1() {
        System.out.println("method1");

    }

    @Override
    public void method22() {
        System.out.println("method22");

    }

    @Override
    public void method33() {
        System.out.println("method33");

    }

    @Override
    public void method2(int x) {
        System.out.println("int x value");

    }

    @Override
    public void method3() {
        System.out.println("method3");

    }

    @Override
    public void defaultMethod() {
        System.out.println("default method");
    }
}
class Impl2 implements Interface1,Interface2{

    @Override
    public void method11() {
        System.out.println("method11 is");

    }

    @Override
    public void method1() {
        System.out.println("method1 is");

    }

    @Override
    public void method22() {
        System.out.println("method22 is");

    }

    @Override
    public void method33() {
        System.out.println("method33 is");

    }

    @Override
    public void method2(int x) {
        System.out.println("parameter int x");

    }

    @Override
    public void method3() {
        System.out.println("method3 is");

    }
}
public class Abstraction1 {
    public static void main(String[] args) {
       Interface1 obj1 = new Impl1();
       obj1.defaultMethod();
       obj1.method1();
       obj1.method2(100);
       obj1.method3();
       Interface2 obj2 = new Impl1();
       obj2.method1();
       obj2.method11();
       obj2.method22();
       obj2.method33();
       Interface1.staticMethod();
        System.out.println(Interface1.x);
        System.out.println(Interface2.y);
    }

}
