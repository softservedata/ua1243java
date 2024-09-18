package module14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private ManufactureCategory manufactureCategory;
    private LocalDate date;
    private double price;

    private final List<Product> listOfProducts = new ArrayList<>();


    public Product() {
        listOfProducts.add(new Product(ManufactureCategory.CAR, LocalDate.of(2012,9,10), 33847575));
        listOfProducts.add(new Product(ManufactureCategory.HOUSE, LocalDate.of(2023,7,15), 476475));
        listOfProducts.add(new Product(ManufactureCategory.CAR, LocalDate.of(2001,9,10), 25252));
        listOfProducts.add(new Product(ManufactureCategory.HOUSE, LocalDate.of(2022,7,6), 34657694));
        listOfProducts.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2018,2,23), 3384));
        listOfProducts.add( new Product(ManufactureCategory.PHONE, LocalDate.of(2020,10,3), 47021));
        listOfProducts.add(new Product(ManufactureCategory.HOUSE, LocalDate.of(2007,8,9), 234567000));
        listOfProducts.add(new Product(ManufactureCategory.HOUSE, LocalDate.of(2008,9,15), 674567000));
        listOfProducts.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2007,8,8), 234));
        listOfProducts.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2024,9,20), 5000));
        listOfProducts.add(new Product(ManufactureCategory.CAR, LocalDate.of(2007,3,7), 23000));
        listOfProducts.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2022,2,3), 4000));
        listOfProducts.add(new Product(ManufactureCategory.HOUSE, LocalDate.of(2017,1,19), 34567000));
        listOfProducts.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2021,8,9), 2340));
        listOfProducts.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2021,10,15), 3100));
    }

    public Product(ManufactureCategory manufactureCategory, LocalDate date, double price) {
        this.manufactureCategory = manufactureCategory;
        this.date = date;
        this.price = price;
    }

    public void run() {
        out:
        while (true) {
            showMainMenu();
            int option = readOption(3);
            switch (option) {
                case 1 -> showProducts();
                case 2 -> findByPriceAndByProductCategory(listOfProducts);
                case 3 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }
    private void showProducts () {
        if (listOfProducts.isEmpty()) {
            System.out.println("There are no products yet.");
        } else {
            listOfProducts.forEach(System.out::println);


        }
    }

    public void findByPriceAndByProductCategory(List<Product> listOfProducts) {

        if(listOfProducts.isEmpty()){
            return;
        }
       List<Product> lst =  listOfProducts.stream()
                .filter(product -> product.getManufactureCategory().equals(ManufactureCategory.PHONE))
                .filter(product -> product.getDate().getDayOfYear()-LocalDate.now().getDayOfYear()<-1)
                .filter(product -> product.getPrice() > 3000)
                .toList();
        System.out.println(lst);

    }

    public ManufactureCategory getManufactureCategory() {
        return manufactureCategory;
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
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
    private int readOption ( int nOptions){
        System.out.println("Enter option from 1 to " + nOptions + ":");
        var scan = new Scanner(System.in);
        return  Integer.parseInt(scan.nextLine());
    }
    private void showMainMenu () {
        System.out.println("""
                    Main menu:
                    1. Show products
                    2. Show phone with price is grater then 3000
                    3. Exit
                   
                    
                    """
        );
    }
}
