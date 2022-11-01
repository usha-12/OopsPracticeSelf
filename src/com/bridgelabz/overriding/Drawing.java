package com.bridgelabz.overriding;

public class Drawing {//overriding - dynamic - run time
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();// behaviour
        circle.draw();
        rectangle.draw();
    }
}
