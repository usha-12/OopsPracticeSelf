package com.bridgelabz.oopsconcept.classandobject;

public class Rectangle {
    int length;
    int width;

    void calculateArea() {
        System.out.println("Area is :"+length*width);
    }

    public static void main(String[] args) {
        Rectangle rs = new Rectangle();
        rs.length= 10;
        rs.width = 20;
        System.out.println("Rectangle Length is :"+rs.length);
        System.out.println("Rectangle width is :"+rs.width);
        rs.calculateArea();

    }
}
