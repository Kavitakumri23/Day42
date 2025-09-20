package com.polymorphism.Practice;


    class Vehicle {
        void start() {
            System.out.println("Vehicle is starting...");
        }
    }

    class CAr extends Vehicle {
        void drive() {
            System.out.println("Car is driving...");
        }
    }

public class Prac6 {
        public static void main(String[] args) {
            CAr c = new CAr();
            c.start();  // from Vehicle
            c.drive();  // from Car
        }
    }

