public class Linear extends WaterVehicle {
    public static final String TYPE_VEHICLE = "Linear";
    private int floors;

    public Linear(int passengers) {
        super(passengers);
    }

    @Override
    public void isSailing() {
        System.out.println("That is " + TYPE_VEHICLE + " and it can sail with speed 120 km per hour");
    }

    public Linear(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Linear{" +
                "floors=" + floors +
                '}';
    }
}
