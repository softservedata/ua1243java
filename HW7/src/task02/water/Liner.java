package task02.water;

import task02.WaterVehicle;

public class Liner extends WaterVehicle {

    private int floors;

    public Liner(int numberOfPassengers, int floors) {
        super(numberOfPassengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing...");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
