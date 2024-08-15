package task02.sky;

import task02.FlyingVehicle;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int numberOfPassengers, int maxDistance) {
        super(numberOfPassengers);
        this.maxDistance = maxDistance;
    }


    @Override
    public void fly() {
        System.out.println("Plane is flying...");
    }

    @Override
    public void land() {
        System.out.println("Plane land.");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
