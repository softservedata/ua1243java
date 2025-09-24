package com.softserve.edu.orest.New.hw6;

public class Refrigerator extends Appliance {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public Refrigerator(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Refrigerator - " +
                "Brand: " + super.getBrand() +
                ", Model: " + super.getModel() +
                ", Capacity: " + capacity +
                " liters";
    }

    @Override
    void displayInfo() {
        System.out.println(this);
    }

}
