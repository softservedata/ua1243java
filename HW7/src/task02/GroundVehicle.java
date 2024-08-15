package task02;

public abstract class GroundVehicle extends PassengerVehicle {

    public GroundVehicle(int numberOfPassengers) {
        super(numberOfPassengers);

    }
    public abstract void drive();
}
