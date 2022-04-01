package com.company.oop2;

public abstract class Animal {
    protected String name;
    protected int weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
