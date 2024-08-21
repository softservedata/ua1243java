public class Boat extends WaterVehicle {
    private int volume;
    private static final String TYPE_VEHICLE = "Boat";

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("That is " + TYPE_VEHICLE + " and can sail with speed 100 km per hour");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                '}';
    }
}
