package task02.sky;

import task02.FlyingVehicle;

public class Helicopter extends FlyingVehicle {
    private int maxHeight;
    private int maxWeight;

    public Helicopter(int numberOfPassengers, int maxHeight, int maxWeight) {
        super(numberOfPassengers);
        this.maxHeight = maxHeight;
        this.maxWeight = maxWeight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying...");
    }

    @Override
    public void land() {
        System.out.println("Helicopter land.");
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
