public class Car extends GroundVehicle{
    private static final String TYPE_VEHICLE="Car";
    private String model;
    public Car(int passengers,String model) {
        super(passengers);
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("That is " + TYPE_VEHICLE + " and can drive with max speed 200  km per hour");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
