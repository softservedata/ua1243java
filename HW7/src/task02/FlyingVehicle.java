package task02;

public abstract class FlyingVehicle extends PassengerVehicle {
    public FlyingVehicle(int numberOfPassengers) {
        super(numberOfPassengers);
    }

    public abstract void fly();
    public abstract void land();
}
