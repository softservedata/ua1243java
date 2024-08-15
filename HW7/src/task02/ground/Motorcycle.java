package task02.ground;

import task02.GroundVehicle;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;
    public Motorcycle(int numberOfPassengers, int maxSpeed) {
        super(numberOfPassengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving...");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
