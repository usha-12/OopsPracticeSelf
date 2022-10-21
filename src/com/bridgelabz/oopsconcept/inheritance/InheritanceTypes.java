package com.bridgelabz.oopsconcept.inheritance;
class A {
    /*1. multiple and hybrid not support in java through classes due to
    * ambiguity
    * 2. diamond death problem
    *  */
            int x = 10;
            int y = 20;
            int z;

            void aMethod() {
                z = x + y;
                System.out.println("Z value is = " + z);
            }
        }
        class B extends A {// Single Inheritance
            int a = 100;

            void bMethod() {
                System.out.println("class B method ");
            }
        }
        class C extends B{// Multi - Level
            int c = 90;
            void cMethod(){
                System.out.println("class C method ");
            }
        }
        class D extends A{// hierarchical
            int d = 400;
            void dMethod(){
                System.out.println("class D method");
            }

        }
    public class InheritanceTypes {
        public static void main(String[] args) {
            A obj1 = new A();
            System.out.println(obj1.x);
            System.out.println(obj1.y);
            obj1.aMethod();
            System.out.println("=========Single Inheritance============");
            B obj2 = new B();
            System.out.println(obj2.a);
            System.out.println(obj2.x);
            System.out.println(obj2.y);
            System.out.println(obj2.z);
            obj2.bMethod();
            obj2.aMethod();
            System.out.println("=========Multi-Level====================");
            C obj3 = new C();
            System.out.println(obj3.c);
            System.out.println(obj3.x);
            System.out.println(obj3.y);
            System.out.println(obj3.z);
            System.out.println(obj3.a);
            obj3.cMethod();
            obj3.aMethod();
            obj3.bMethod();
            System.out.println("=====================Hierarchy==============");
            D obj4 = new D();
            System.out.println(obj4.x);
            System.out.println(obj4.d);
            System.out.println(obj4.y);
            System.out.println(obj4.z);
            obj4.aMethod();
            obj4.dMethod();

        }
    }
