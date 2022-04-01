package oop3;

public enum Car {
    FIRST("AUDI"),
    SECOND("JEEP"),
    THIRD("VOLGA"),
    FORTH("HONDA"),
    FIFTH("LEXUS"),
    SIXTH("SUBARU"),
    SEVENTH("LADA");


    private final String brand;

    public String getBrand() {
        return brand;
    }

    Car(String brand) {
        this.brand = brand;
    }
}
