public class Helicopter extends FlyingVehicle{
    private static final String TYPE_VEHICLE="Helicopter";
    private int weight;
    private int maxHeight;
    public Helicopter(int passengers, int maxHeight) {
        super(passengers);
        this.maxHeight=maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("That is " + TYPE_VEHICLE + " and can fly with speed 300 km per hour");
    }

    @Override
    public void land() {
        super.land();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
