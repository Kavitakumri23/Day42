package com.polymorphism.Practice;

class ANimal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class DOg extends ANimal {
    @Override
    void eat() {
        super.eat();  // calling parent method first
        System.out.println("Dog eats bones");
    }
}

public class Parc8 {
    public static void main(String[] args) {
        DOg d = new DOg();
        d.eat();
    }
}


