package com.company.oop2;

public class Dog extends Animal {
    private int energyLevel;

    public Dog(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", energyLevel=" + energyLevel +
                '}';
    }
}
