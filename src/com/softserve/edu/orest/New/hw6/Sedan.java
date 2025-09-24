package com.softserve.edu.orest.New.hw6;

public class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan " + getModel() + " runs at max speed " + getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " stops");
    }
}
