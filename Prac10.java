package com.polymorphism.Practice;

    class Account {
        void accountType() {
            System.out.println("Generic Account");
        }
    }

    class SavingAccount extends Account {
        @Override
        void accountType() {
            System.out.println("Saving Account with 4% interest");
        }
    }

    class CurrentAccount extends Account {
        @Override
        void accountType() {
            System.out.println("Current Account with overdraft facility");
        }
    }

public class Prac10 {
        public static void main(String[] args) {
            Account a1 = new SavingAccount(); // runtime polymorphism
            Account a2 = new CurrentAccount();

            a1.accountType();
            a2.accountType();
        }
    }

