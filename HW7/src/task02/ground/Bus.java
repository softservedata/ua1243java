package task02.ground;

import task02.GroundVehicle;

public class Bus extends GroundVehicle {
    private String route;
    public Bus(int numberOfPassengers, String route) {
        super(numberOfPassengers);
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus driving " + route);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
