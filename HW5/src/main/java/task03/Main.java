package task03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            Car[] cars = {
                    new Car("Sedan", 2015, 2.0),
                    new Car("SUV", 2018, 3.5),
                    new Car("Hatchback", 2020, 1.8),
                    new Car("Convertible", 2017, 2.5)
            };

            CarService carService = new CarService();
            System.out.print("Enter year of production to search: ");
            int year = scanner.nextInt();

            Car[] filteredCars = carService.filterByYear(cars, year);
            System.out.println("Cars from the year " + year + ":");
            if (filteredCars.length == 0) {
                System.out.println("No cars found");
            }
            else{
                for (Car car : filteredCars) {
                    System.out.println(car);
                }
            }

            Car[] sortedCars = carService.sortByYear(cars);
            System.out.println("Cars sorted by year of production:");
            for (Car car : sortedCars) {
                System.out.println(car);
            }
        } catch (InputMismatchException e){
            System.err.println("Invalid input. Try again.");
        }
    }
}
