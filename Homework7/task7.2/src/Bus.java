public class Bus  extends GroundVehicle{
    private static final String TYPE_VEHICLE="Bus";
    private String route;
    public Bus(int passengers, String route) {
        super(passengers);
        this.route=route;
    }

    @Override
    public void drive() {
        //super.drive();
        System.out.println("That is " + TYPE_VEHICLE + " and can drive with 90 kilometers per hour!");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "route='" + route + '\'' +
                '}';
    }
}
