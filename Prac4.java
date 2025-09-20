package com.polymorphism.Practice;


 class EMPLOYEE {
     String name;
     double salary;

     EMPLOYEE(String n, double s) {
         name = n;
         salary = s;
     }

     void display() {
         System.out.println("Employee: " + name + ", Salary: " + salary);
     }
 }

     public class Prac4 {
         public static void main(String[] args) {
             EMPLOYEE e1 = new EMPLOYEE("Amit", 60000);
             EMPLOYEE e2 = new EMPLOYEE("Priya", 75000);

             e1.display();
             e2.display();
         }
     }
