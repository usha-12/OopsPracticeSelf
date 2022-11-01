package com.bridgelabz.overloading;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator1 calculatorTest = new Calculator1();
        calculatorTest.sum(10,20);
        calculatorTest.sum(20,40,50);
        calculatorTest.sum(10,30,50,60);
        calculatorTest.sum(10, 23.6f);
    }
}
