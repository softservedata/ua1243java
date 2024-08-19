package com.softserve.edu13car;

public abstract class ACar implements ICar {
    protected double maxSpeed;
    //private double maxSpeed;
    public static final String MESSAGE = "Hello";

    public ACar() {
        //super(); // from Object
        System.out.println("\tConstructor public ACar()");
        // MESSAGE = "World"; // Compile Error
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //public abstract void carRides();
}
