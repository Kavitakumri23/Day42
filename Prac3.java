package com.polymorphism.Practice;


    class Employee {
        String name;
        int salary;

        // Parameterized constructor
        Employee(String n, int s) {
            name = n;
            salary = s;
        }

        // Copy constructor
        Employee(Employee e) {
            name = e.name;
            salary = e.salary;
        }

        void display() {
            System.out.println("Name: " + name + ", Salary: " + salary);
        }
    }
        public class Prac3 {
        public static void main(String[] args) {
            Employee e1 = new Employee("Kavita", 50000);
            Employee e2 = new Employee(e1); // copy constructor

            e1.display();
            e2.display();
        }
    }

