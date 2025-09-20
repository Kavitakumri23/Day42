package com.polymorphism.Practice;

class Car {
    String brand;
    int price;

    // Constructor 1
    Car() {
        brand = "Unknown";
        price = 0;
    }

    // Constructor 2
    Car(String b) {
        brand = b;
        price = 500000;
    }

    // Constructor 3
    Car(String b, int p) {
        brand = b;
        price = p;
    }

    void show() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

}
    public class Prac2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Honda");
        Car c3 = new Car("Tesla", 8000000);

        c1.show();
        c2.show();
        c3.show();
    }

}
