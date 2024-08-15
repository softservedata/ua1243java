package task02;

public abstract class WaterVehicle extends PassengerVehicle {
    public WaterVehicle(int numberOfPassengers) {
        super(numberOfPassengers);
    }

    public abstract void isSailing();
}
