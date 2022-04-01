package com.company.oop1;

public class Cat {

   private String name = null;
   private int weightKg = 3;
   private int age = 2;
   private String color = "white";
   private String address = null;

    public Cat(String name, int weightKg, int age){
           this.name = name;
           this.weightKg = weightKg;
           this.age = 0;
    }
    public Cat(String name, int age){
           this.name = name;
           this.age = 0;
    }
    public Cat(int weightKg, String color){
        this.weightKg = weightKg;
        this.color = color;
        this.age = 0;
    }

    public Cat(int weightKg, String color, String address) {
        this.weightKg = weightKg;
        this.color = color;
        this.address = address;
    }
    public void getCatInfo(){
        System.out.printf("\nCat's name: %s, age: %d, weight: %d, color: %s, address: %s",
                            name, age, weightKg, color, address);
    }
}
