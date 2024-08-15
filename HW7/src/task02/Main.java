package task02;

import task02.ground.Bus;
import task02.ground.Car;
import task02.ground.Motorcycle;
import task02.sky.Helicopter;
import task02.sky.Plane;
import task02.water.Boat;
import task02.water.Liner;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(50, "Route 42");
        Car car = new Car(4, "Toyota Corolla");
        Motorcycle motorcycle = new Motorcycle(2, 180);

        Helicopter helicopter = new Helicopter(5, 10000, 3000);
        Plane plane = new Plane(200, 15000);

        Boat boat = new Boat(20, 5000);
        Liner liner = new Liner(1000, 10);

        System.out.println("Testing Ground Vehicles:");
        bus.drive();
        System.out.println("Route: " + bus.getRoute());

        car.drive();
        System.out.println("Model: " + car.getModel());

        motorcycle.drive();
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " km/h");

        System.out.println("\nTesting Sky Vehicles:");
        helicopter.fly();
        helicopter.land();
        System.out.println("Max Height: " + helicopter.getMaxHeight() + " meters");
        System.out.println("Max Weight: " + helicopter.getMaxWeight() + " kg");

        plane.fly();
        plane.land();
        System.out.println("Max Distance: " + plane.getMaxDistance() + " km");

        System.out.println("\nTesting Water Vehicles:");
        boat.isSailing();
        System.out.println("Volume: " + boat.getVolume() + " liters");

        liner.isSailing();
        System.out.println("Floors: " + liner.getFloors());
    }
}
