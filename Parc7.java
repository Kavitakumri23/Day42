package com.polymorphism.Practice;
class Parent {
    String name = "Parent Class";

    void showName() {
        System.out.println("Name in Parent: " + name);
    }
}

    class Child extends Parent {
        String name = "Child Class";

        void showName() {
            System.out.println("Name in Child: " + name);
            System.out.println("Name in Parent (using super): " + super.name);
        }
    }


public class Parc7 {
        public static void main(String[] args) {
            Child c = new Child();
            c.showName();
        }
    }

