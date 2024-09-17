package HW5;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Car {
    String type;
    int yearOfProduction;
    double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public void displayCarInfo() {
        System.out.println("Car Type: " + type + ", Year: " + yearOfProduction + ", Engine Capacity: " + engineCapacity + "L");
    }

    public class Main {
        public static void main(String[] args) {
            Car car1 = new Car("Sedan", 2015, 2.0);
            Car car2 = new Car("SUV", 2018, 3.5);
            Car car3 = new Car("Hatchback", 2015, 1.6);
            Car car4 = new Car("Coupe", 2020, 2.5);

            Car[] cars = {car1, car2, car3, car4};

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year to find cars of that model year: ");
            int year = scanner.nextInt();

            System.out.println("\nCars of model year " + year + ":");
            boolean found = false;
            for (Car car : cars) {
                if (car.yearOfProduction == year) {
                    car.displayCarInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No cars found for the given year.");
            }

            Arrays.sort(cars, Comparator.comparingInt(car -> car.yearOfProduction));

            System.out.println("\nCars sorted by year of production:");
            for (Car car : cars) {
                car.displayCarInfo();
            }
        }
    }
}
