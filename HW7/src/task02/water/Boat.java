package task02.water;

import task02.WaterVehicle;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int numberOfPassengers, int volume) {
        super(numberOfPassengers);
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing...");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
