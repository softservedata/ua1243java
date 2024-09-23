package academy.softserve.Homework5.Task3;


import java.util.Scanner;

/*Create class called Car with fields: type, year of production and engine capacity.
        • Create and initialize in main() method four instances of class Car.
        • Output result for cars:
o certain model year (enter year in the console);
o sorted cars by the field “year of production ”.
*/
public class Car {
    Scanner scan = new Scanner(System.in);
    private String type;
    private int yearOfProduction;
    double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    // method to output info about all cars
    public static void outputInfo(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    // method to output all cars in certain year
    public static void OutputCarsInCertainYear(Car[] cars) {
        boolean found = false;
        System.out.println("\nInput year to see cars produced then: ");
        Scanner scan = new Scanner(System.in);
        int certainYear = scan.nextInt();
        System.out.println("Cars produced in " + certainYear + ":");
        for (Car car : cars) {
            if (car.yearOfProduction == certainYear && car.yearOfProduction != 0) {
                found = true;
                System.out.println(car.toString());
            }
        }
        if (!found) {
            System.out.println("No cars produced in this year.");
        }

    }

    // method to sort and output all cars by year of production
    public static Car[] sortCarsByYearOfProduction(Car[] cars) {
        System.out.println("\nCars sorted by year of production:");
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1; j++) {
                if (cars[i].yearOfProduction < cars[j + 1].yearOfProduction) {
                    Car tmp = cars[j + 1];
                    cars[i] = cars[j + 1];
                    cars[j + 1] = tmp;
                }
            }
        }
        return cars;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car " + "type '" + type + '\'' + ", yearOfProduction " + yearOfProduction + ", engineCapacity " + engineCapacity;
    }
}


