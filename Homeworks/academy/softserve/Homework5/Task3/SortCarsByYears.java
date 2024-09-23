package academy.softserve.Homework5.Task3;

import java.util.Arrays;

public class SortCarsByYears {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Suv", 2022, 4.5);
        cars[1] = new Car("Sedan", 2005, 2.0);
        cars[2] = new Car("TIR", 2018, 8.5);
        cars[3] = new Car("Coupe", 2005, 3.5);

        System.out.println("All cars:");
        Car.outputInfo(cars);
        Car.OutputCarsInCertainYear(cars);
        Car.sortCarsByYearOfProduction(cars);
        Car.outputInfo(cars);
    }
}
