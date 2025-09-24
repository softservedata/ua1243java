package com.softserve.edu.orest.New.hw6;

public class WashingMachine extends Appliance {

    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public WashingMachine(String brand, String model, int loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "WashingMachine - " +
                "Brand: " + super.getBrand() +
                ", Model: " + super.getModel() +
                ", LoadCapacity: " + loadCapacity +
                " kg";
    }

    @Override
    void displayInfo() {
        System.out.println(this);
    }

}
