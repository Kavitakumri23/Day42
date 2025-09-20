package com.polymorphism.Practice;


    class LivingBeing {
        void breathe() {
            System.out.println("All living beings breathe");
        }
    }

    class Human extends LivingBeing {
        void speak() {
            System.out.println("Human can speak");
        }
    }

    class STudent extends Human {
        void study() {
            System.out.println("Student studies");
        }
    }

public class Prac9 {
        public static void main(String[] args) {
            STudent s = new STudent();
            s.breathe();
            s.speak();
            s.study();
        }
    }

