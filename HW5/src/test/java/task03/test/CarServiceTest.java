package task03.test;

import task03.Car;
import task03.CarService;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarServiceTest {

    @Test
    public void testFilterByYear() {
        Car[] cars = {
                new Car("Sedan", 2015, 2.0),
                new Car("SUV", 2018, 3.5),
                new Car("Hatchback", 2015, 1.8),
                new Car("Convertible", 2017, 2.5)
        };

        CarService carService = new CarService();
        Car[] result = carService.filterByYear(cars, 2015);

        assertEquals(2, result.length);
        assertEquals("Sedan", result[0].getType());
        assertEquals("Hatchback", result[1].getType());
    }

    @Test
    public void testFilterByYearNoMatch() {
        Car[] cars = {
                new Car("Sedan", 2015, 2.0),
                new Car("SUV", 2018, 3.5),
                new Car("Hatchback", 2015, 1.8),
                new Car("Convertible", 2017, 2.5)
        };

        CarService carService = new CarService();
        Car[] result = carService.filterByYear(cars, 2020);

        assertEquals(0, result.length);
    }

    @Test
    public void testSortByYear() {
        Car[] cars = {
                new Car("Convertible", 2017, 2.5),
                new Car("Hatchback", 2015, 1.8),
                new Car("SUV", 2018, 3.5),
                new Car("Sedan", 2015, 2.0)
        };

        CarService carService = new CarService();
        Car[] result = carService.sortByYear(cars);

        assertEquals("Hatchback", result[0].getType());
        assertEquals("Sedan", result[1].getType());
        assertEquals("Convertible", result[2].getType());
        assertEquals("SUV", result[3].getType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilterByYearNullArray() {
        CarService carService = new CarService();
        carService.filterByYear(null, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilterByYearNullElement() {
        CarService carService = new CarService();
        Car[] cars = { new Car("Sedan", 2015, 2.0), null };
        carService.filterByYear(cars, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSortByYearNullArray() {
        CarService carService = new CarService();
        carService.sortByYear(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSortByYearNullElement() {
        CarService carService = new CarService();
        Car[] cars = { new Car("Sedan", 2015, 2.0), null };
        carService.sortByYear(cars);
    }
}
