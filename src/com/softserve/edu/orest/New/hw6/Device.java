package com.softserve.edu.orest.New.hw6;

abstract class Device {
    private String brand;
    private String model;
    private boolean powerStatus;

    private Device (String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

    void turnOn() {
        powerStatus = true;
        System.out.println("The device is now ON.");
    }

    void turnOff() {
        powerStatus = false;
        System.out.println("The device is now OFF.");
    }

    abstract void displayInfo();

}
