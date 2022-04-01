package com.company.oop2;

public class Main {
    public static void main(String[] args) {
     Animal dog = new Dog(10);
     dog.setName("Reks");
     System.out.println(dog.toString());
     Animal cat = new Cat ("Happy");
     cat.setName("Mia");
     System.out.println(cat.toString());
    }
}
