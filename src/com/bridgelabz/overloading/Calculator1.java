package com.bridgelabz.overloading;

public class Calculator1 {// over loading- compile time -static

     public void sum(int x, int y){
         System.out.println("sum is :"+(x+y));

     }
    public void sum(int x, int y, int z){
        System.out.println("sum is :"+(x+y+z));

    }
    public void sum(int x, int y, int z, int w){
        System.out.println("sum id :"+(x+y+z+w));
    }
    public void sum(int x, float y){
        System.out.println("sum is :"+(x+y));

    }

}
