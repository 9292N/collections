package com.company.oop2;

public class Cat extends Animal{
    private String mood;

    public Cat(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", mood='" + mood + '\'' +
                '}';
    }
}
