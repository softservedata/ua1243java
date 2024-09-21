package HW7;

interface Vehicle {
    void drive();
}

class Passengers {
    private int passengers;

    public Passengers() {}

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

class GroundVehicle extends Passengers implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a ground vehicle");
    }
}

// FlyingVehicle Class
class FlyingVehicle extends Passengers {
    public void fly() {
        System.out.println("Flying a vehicle");
    }

    public void land() {
        System.out.println("Landing a vehicle");
    }
}

class WaterVehicle extends Passengers {
    public void isSailing() {
        System.out.println("Sailing a water vehicle");
    }
}

class Car extends GroundVehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving a car: " + model);
    }
}

class Bus extends GroundVehicle {
    private String route;

    public Bus(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Driving a bus on route: " + route);
    }
}

// Plane Class
class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Flying a plane with max distance: " + maxDistance);
    }
}

class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
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
    public void fly() {
        System.out.println("Flying a helicopter with max height: " + maxHeight);
    }
}

class Liner extends WaterVehicle {
    private int floors;

    public Liner(int floors) {
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Sailing a liner with " + floors + " floors");
    }
}

class Boat extends WaterVehicle {
    private int volume;

    public Boat(int volume) {
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
        System.out.println("Sailing a boat with volume: " + volume);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.setPassengers(4);
        car.drive();
        System.out.println("Passengers: " + car.getPassengers());

        Bus bus = new Bus("Route 66");
        bus.setPassengers(30);
        bus.drive();
        System.out.println("Passengers: " + bus.getPassengers());

        Plane plane = new Plane(10000);
        plane.setPassengers(150);
        plane.fly();
        System.out.println("Passengers: " + plane.getPassengers());
        plane.land();

        Helicopter helicopter = new Helicopter(2000, 5000);
        helicopter.setPassengers(5);
        helicopter.fly();
        System.out.println("Passengers: " + helicopter.getPassengers());
        helicopter.land();

        Liner liner = new Liner(10);
        liner.setPassengers(1000);
        liner.isSailing();
        System.out.println("Passengers: " + liner.getPassengers());

        Boat boat = new Boat(300);
        boat.setPassengers(20);
        boat.isSailing();
        System.out.println("Passengers: " + boat.getPassengers());
    }
}
