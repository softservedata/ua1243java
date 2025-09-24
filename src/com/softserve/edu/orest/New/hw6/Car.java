package com.softserve.edu.orest.New.hw6;

abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public static void main(String[] args) {
        Car[] cars = {
                new Truck("MAN", 120, 2020),
                new Truck("MAN", 100, 2015),
                new Sedan("BMW", 150, 2022),
                new Sedan("Volvo", 130, 2021),

        };
        for (var car : cars) {
            car.run();
            car.stop();
        }
    }

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    abstract void run();

    abstract void stop();
}
