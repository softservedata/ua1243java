interface Vehicle {
    void start();
    void stop();
}

abstract class FlyingVehicle implements Vehicle {
    public abstract void fly();
}

abstract class WaterVehicle implements Vehicle {
    public abstract void sail();
}

abstract class GroundVehicle implements Vehicle {
    public abstract void drive();
}

class Plane extends FlyingVehicle {
    @Override
    public void start() {
        System.out.println("Plane starting.");
    }

    @Override
    public void stop() {
        System.out.println("Plane stopping.");
    }

    @Override
    public void fly() {
        System.out.println("Plane flying.");
    }
}

class Helicopter extends FlyingVehicle {
    @Override
    public void start() {
        System.out.println("Helicopter starting.");
    }

    @Override
    public void stop() {
        System.out.println("Helicopter stopping.");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter flying.");
    }
}

class Boat extends WaterVehicle {
    @Override
    public void start() {
        System.out.println("Boat starting.");
    }

    @Override
    public void stop() {
        System.out.println("Boat stopping.");
    }

    @Override
    public void sail() {
        System.out.println("Boat sailing.");
    }
}

class Car extends GroundVehicle {
    @Override
    public void start() {
        System.out.println("Car starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping.");
    }

    @Override
    public void drive() {
        System.out.println("Car driving.");
    }
}

class Passengers {
    private int passengerCount;

    public Passengers(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }
}

public class hw2_lesson7 {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        plane.start();
        ((Plane) plane).fly();
        plane.stop();

        Vehicle helicopter = new Helicopter();
        helicopter.start();
        ((Helicopter) helicopter).fly();
        helicopter.stop();

        Vehicle boat = new Boat();
        boat.start();
        ((Boat) boat).sail();
        boat.stop();

        Vehicle car = new Car();
        car.start();
        ((Car) car).drive();
        car.stop();

        Passengers passengers = new Passengers(5);
        System.out.println("Number of passengers: " + passengers.getPassengerCount());
    }
}
