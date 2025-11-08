package com.softserve.edu.orest.New.hw14;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    private String manufacture;
    private String category;
    private LocalDate date;
    private double price;

    public Product(String manufacture, String category, LocalDate date, double price) {
        this.manufacture = manufacture;
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacture='" + manufacture + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1);

        List<Product> products = Arrays.asList(
                new Product("Apple", "Phone", LocalDate.of(2023, 10, 1), 3500.0),
                new Product("Samsung", "Phone", LocalDate.of(2024, 5, 15), 2800.0),
                new Product("Google", "Phone", LocalDate.of(2023, 6, 20), 3200.0),
                new Product("Sony", "TV", LocalDate.of(2024, 1, 10), 1500.0),
                new Product("Apple", "Laptop", LocalDate.of(2023, 11, 5), 2500.0),
                new Product("Samsung", "Phone", LocalDate.of(2023, 9, 25), 4000.0),
                new Product("OnePlus", "Phone", LocalDate.of(2024, 3, 12), 3100.0),
                new Product("LG", "Fridge", LocalDate.of(2023, 7, 18), 1200.0),
                new Product("Apple", "Phone", LocalDate.of(2023, 4, 30), 4500.0),
                new Product("Huawei", "Phone", LocalDate.of(2024, 8, 22), 2900.0),
                new Product("Microsoft", "Laptop", LocalDate.of(2023, 12, 15), 1800.0),
                new Product("Samsung", "Phone", LocalDate.of(2023, 2, 10), 3600.0),
                new Product("Xiaomi", "Phone", LocalDate.of(2024, 6, 5), 2700.0),
                new Product("Dell", "Laptop", LocalDate.of(2023, 3, 20), 2000.0),
                new Product("Apple", "Phone", LocalDate.of(2023, 1, 15), 5000.0),
                new Product("Nokia", "Phone", LocalDate.of(2024, 9, 1), 2500.0),
                new Product("Panasonic", "TV", LocalDate.of(2023, 5, 25), 1300.0),
                new Product("Google", "Phone", LocalDate.of(2023, 8, 10), 3300.0),
                new Product("Samsung", "Phone", LocalDate.of(2024, 4, 18), 3400.0),
                new Product("Motorola", "Phone", LocalDate.of(2023, 10, 5), 3100.0)
        );

        List<Product> filtered = products.stream()
                .filter(p -> "Phone".equals(p.getCategory()))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDate().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        filtered.forEach(System.out::println);

        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );
    }
    static Optional<String> mostPopularName(Stream< Employee> employees) {
        if (employees == null) {
            return Optional.empty();
        }

        return employees
                .collect(Collectors.groupingBy(
                        Employee::getName,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}