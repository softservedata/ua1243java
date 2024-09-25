import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    private String name;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String name, String category, LocalDate dateOfManufacture, double price) {
        this.name = name;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }
}

public class hw1_lesson14 {
    public static List<Product> getSortedPhones(List<Product> products) {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        return products.stream()
                .filter(product -> "Phone".equals(product.getCategory()) &&
                        product.getPrice() > 3000 &&
                        product.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone 13", "Phone", LocalDate.of(2021, 5, 20), 3500));
        products.add(new Product("Samsung Galaxy S21", "Phone", LocalDate.of(2021, 4, 15), 3200));
        products.add(new Product("OnePlus 9", "Phone", LocalDate.of(2020, 3, 12), 2800));
        products.add(new Product("Google Pixel 5", "Phone", LocalDate.of(2022, 2, 28), 4500));
        products.add(new Product("Nokia 3310", "Phone", LocalDate.of(2020, 6, 10), 1500));
        products.add(new Product("Sony Xperia 1", "Phone", LocalDate.of(2022, 1, 5), 3100));
        products.add(new Product("Huawei P40", "Phone", LocalDate.of(2020, 8, 20), 6000));
        products.add(new Product("Xiaomi Mi 11", "Phone", LocalDate.of(2021, 10, 25), 4000));
        products.add(new Product("Oppo Find X3", "Phone", LocalDate.of(2020, 12, 12), 3700));
        products.add(new Product("Vivo X60", "Phone", LocalDate.of(2020, 9, 1), 2900));
        products.add(new Product("iPhone 12", "Phone", LocalDate.of(2020, 11, 1), 4500));
        products.add(new Product("Samsung Galaxy A52", "Phone", LocalDate.of(2021, 3, 30), 3500));
        products.add(new Product("Realme 8 Pro", "Phone", LocalDate.of(2022, 2, 10), 3200));
        products.add(new Product("Motorola Edge", "Phone", LocalDate.of(2021, 6, 15), 3300));
        products.add(new Product("Nokia 7.2", "Phone", LocalDate.of(2020, 2, 20), 2900));
        products.add(new Product("LG Velvet", "Phone", LocalDate.of(2021, 5, 5), 3100));
        products.add(new Product("HTC U12+", "Phone", LocalDate.of(2019, 3, 15), 5000));
        products.add(new Product("Sony Xperia 5 II", "Phone", LocalDate.of(2020, 11, 30), 6000));
        products.add(new Product("Asus Zenfone 8", "Phone", LocalDate.of(2021, 7, 25), 3500));
        products.add(new Product("ZTE Axon 20", "Phone", LocalDate.of(2021, 1, 20), 4200));

        List<Product> sortedPhones = getSortedPhones(products);
        System.out.println("Sorted Phones: " + sortedPhones);

        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice", "Manager"),
                new Employee("Bob", "Developer"),
                new Employee("Alice", "Developer"),
                new Employee("Charlie", "Manager"),
                new Employee("Bob", "Developer")
        );

        Optional<String> popularName = mostPopularName(employeeList.stream());
        System.out.println("Most Popular Name: " + popularName.orElse("No employees found"));
    }
}
