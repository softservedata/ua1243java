public class Motorcycle extends GroundVehicle{
    private static final String TYPE_VEHICLE="Motorcycle";
    private int  maxSpeed;
    public Motorcycle(int passengers,int  maxSpeed) {
        super(passengers);
        this.maxSpeed=maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("That is " + TYPE_VEHICLE + " and can drive with max speed 260  km per hour");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
