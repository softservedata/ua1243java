package task02;

public abstract class PassengerVehicle {
    private int numberOfPassengers;

    public PassengerVehicle(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
