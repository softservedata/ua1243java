package com.softserve.edu.orest.New.hw6;

public abstract class Appliance {
    private String brand;
    private String model;

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    abstract void displayInfo();


}
