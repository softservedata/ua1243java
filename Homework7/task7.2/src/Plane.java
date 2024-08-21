public class Plane extends FlyingVehicle{
    private static final String TYPE_VEHICLE="Plane";
    private int maxDistance;
    public Plane(int passengers,int maxDistance) {
        super(passengers);
        this.maxDistance=maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("That is " + TYPE_VEHICLE + " and it  can fly with speed 700 km per hour");
    }
    @Override
    public void land() {
        super.land();
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance=" + maxDistance +
                '}';
    }
}
