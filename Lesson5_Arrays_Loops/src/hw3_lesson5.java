import java.util.Arrays;
import java.util.Scanner;

class Car {
    String type;
    int yearOfProduction;
    double engineCapacity;

    Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}

public class hw3_lesson5 {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Sedan", 2024, 2.0);
        cars[1] = new Car("SUV", 2020, 3.5);
        cars[2] = new Car("Hatchback", 2010, 1.6);
        cars[3] = new Car("Convertible", 3038, 100.5);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year of production to filter cars: ");
        int year = scan.nextInt();
        System.out.println("Cars from the year " + year + ":");
        for (Car car : cars) {
            if (car.yearOfProduction == year) {
                System.out.println(car);
            }
        }

        Arrays.sort(cars, (car1, car2) -> Integer.compare(car1.yearOfProduction, car2.yearOfProduction));
        System.out.println("\nCars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
