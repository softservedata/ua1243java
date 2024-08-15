package task02.ground;

import task02.GroundVehicle;

public class Car extends GroundVehicle {
    private String model;
    public Car(int numberOfPassengers, String model) {
        super(numberOfPassengers);
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println(model + " is driving...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
