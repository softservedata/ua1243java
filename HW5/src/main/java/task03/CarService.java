package task03;

public class CarService {

    public Car[] filterByYear(Car[] cars, int year) {
        if (cars == null) {
            throw new IllegalArgumentException("The car array cannot be null.");
        }
        int count = 0;
        for (Car car : cars) {
            if (car == null) {
                throw new IllegalArgumentException("Car array contains null elements.");
            }
            if (car.getYearOfProduction() == year) {
                count++;
            }
        }
        Car[] filteredCars = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                filteredCars[index++] = car;
            }
        }
        return filteredCars;
    }

    public Car[] sortByYear(Car[] cars) {
        if (cars == null) {
            throw new IllegalArgumentException("The car array cannot be null.");
        }
        for (Car car : cars) {
            if (car == null) {
                throw new IllegalArgumentException("Car array contains null elements.");
            }
        }
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYearOfProduction() > cars[j + 1].getYearOfProduction()) {
                    Car car = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = car;
                }
            }
        }
        return cars;
    }
}
