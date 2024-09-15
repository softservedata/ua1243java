package task01;

import java.util.List;

public class ProductManagerApp {
    public static void main(String[] args) {
        List <Product> products = ProductManager.getRandomProductList();
        System.out.println("Products list: ");
        products.forEach(System.out::println);

        System.out.println("Phones with price more than 3000 and date manufacture more than 1 year: ");
        ProductManager.getPhonesByPriceAndYear(products).forEach(System.out::println);
    }
}
