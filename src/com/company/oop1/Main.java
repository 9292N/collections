package com.company.oop1;

public class Main {
    public static void main(String [] args){
        // #1 BankAccountPublic class with public fields
        BankAccount bankAccount = new BankAccount();
        bankAccount.ID = 1;
        bankAccount.balance = 15;

        System.out.printf("\n%s's ID: %d and balance: %d", bankAccount.getClass().getSimpleName(),
                bankAccount.ID, bankAccount.balance);
        System.out.println("\n_______");

        //#2 BankAccountPrivate class with private fields and public methods

        BankAccountPrivate bankAccountPrivate = new BankAccountPrivate(2, 15000);
        System.out.printf("\n%s's ID: %d and initial balance: %d",
                bankAccountPrivate.getClass().getSimpleName(), bankAccountPrivate.getID(),
                bankAccountPrivate.getBalance());

        bankAccountPrivate.deposit(5000);
        System.out.printf("\n%s's ID: %d balance after deposit: %d",
                bankAccountPrivate.getClass().getSimpleName(), bankAccountPrivate.getID(),
                bankAccountPrivate.getBalance());
        bankAccountPrivate.withdraw(2000);
        System.out.printf("\n%s's ID: %d and balance after withdraw: %d",
                bankAccountPrivate.getClass().getSimpleName(), bankAccountPrivate.getID(),
                bankAccountPrivate.getBalance());
        System.out.println("\nTrying to get 19000:");
        bankAccountPrivate.withdraw(19000);
        System.out.println("\n_______");

        // #3 House class with method returning years past from construction year
        // and method showing all info
        House house = new House("Elite House", 2020, 15 );
        house.getHouseInfo();
        System.out.println("\n_______");

        //#4 Cat class with 5 initiators

        Cat cat1 = new Cat("Teo", 2);
        cat1.getCatInfo();
        Cat cat2 = new Cat(4, "white", "Archa Beshik 2");
        cat2.getCatInfo();
        Cat cat3 = new Cat("Avatar", 5);
        cat3.getCatInfo();
        Cat cat4 = new Cat(5, "black");
        cat4.getCatInfo();
        Cat cat5 = new Cat(3, "brown","Maldybaev str.34");
        cat5.getCatInfo();
    }
}
