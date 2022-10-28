package com.bridgelabz.oopsconcept.polymorphisum;
// private < default < protected < public
// while overriding, we can increase the scope of a method, but we can not reduce the scope

//      private - private method can not be inherited and hence it can not be overridden
//      we can take default, protected and public, and we can not take private


class Parent5{
    private void method1(){
        System.out.println("method1() of Parent5");
    }
    void method2(){
        System.out.println("method2() of parent5");
    }
    protected void method3(){
        System.out.println("method3() of parent5");
    }
    public void method4(){
        System.out.println("method4() of parent5");
    }

}
//
class Child5 extends Parent5{
    // we can take default , protected and public
    // we cannot take private
    @Override
    void method2() {
        System.out.println("method2() of parent5................");
    }

    // we can take protected and public
    // we cannot take private and default

    @Override
    protected void method3() {
        System.out.println("method3() of parent5......................");
    }
    // we can take public
    // we cannot take private , default and protected

    @Override
    public void method4() {
        System.out.println("method4() of parent5.......................");
    }
}
public class Polymorphism5 {
    public static void main(String[] args) {
        Parent5 obj = new Child5();//
        obj.method2();
        obj.method3();
        obj.method4();
    }

}
