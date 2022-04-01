package com.company.oop1;

import java.util.Calendar;

public class House {
    private String name;
    private int yearOfConstruction;
    private int numberOfFloor;

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
    this.name = name;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {

        this.numberOfFloor = numberOfFloor;
    }
    // constructor
    public House(String name, int yearOfConstruction, int numberOfFloor) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.numberOfFloor = numberOfFloor;
    }

    public int getYearsFromConstructions(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yearOfConstruction;
    }
    public void getHouseInfo(){
        System.out.printf("\n%s's name: %s, year of construction: %d, number of floor: %d"
                + "\nYears past from construction: %d ", getClass().getSimpleName(),
                name, yearOfConstruction, numberOfFloor, getYearsFromConstructions());
    }

}

