abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();

    public abstract void stop();

    public void printInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed +
                " km/h, Year of Production: " + yearOfProduction);
    }
}

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println(model + " truck is running.");
    }

    @Override
    public void stop() {
        System.out.println(model + " truck has stopped.");
    }
}

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println(model + " sedan is running.");
    }

    @Override
    public void stop() {
        System.out.println(model + " sedan has stopped.");
    }
}

public class pr1_lesson6 {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Truck("Scania", 148, 2023);
        cars[1] = new Sedan("BMW M5 Competition", 320, 2021);
        cars[2] = new Truck("Volvo", 156, 2019);
        cars[3] = new Sedan("BMW f30", 256, 2018);

        for (Car car : cars) {
            car.printInfo();
            car.run();
            car.stop();
            System.out.println();
        }
    }
}
