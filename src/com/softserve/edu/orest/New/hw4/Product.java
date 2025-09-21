package com.softserve.edu.orest.New.hw4;

public class Product {
    private String  name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        Product product1 = new Product("Table", 100, 5);
        Product product2 = new Product("Desk", 200, 1);
        Product product3 = new Product("Lamp", 30, 5);
        Product product4 = new Product("Door", 150, 1);

        Product mostExpensive = product1;
        if (product2.price > mostExpensive.price) {
            mostExpensive = product2;
        }
        if (product3.price > mostExpensive.price) {
            mostExpensive = product3;
        }
        if (product3.price > mostExpensive.price) {
            mostExpensive = product3;
        }
        System.out.println("The most expensive product is " + mostExpensive.name + " with a quantity " + mostExpensive.quantity);

        int maxQuantity = product1.quantity;
        if (product2.quantity > maxQuantity) {
            maxQuantity = product2.quantity;
        }
        if (product3.quantity > maxQuantity) {
            maxQuantity = product3.quantity;
        }
        if (product4.quantity > maxQuantity) {
            maxQuantity = product4.quantity;
        }
        System.out.println("The products with maximum quantity of " + maxQuantity + " are the following:");

        if (product1.quantity == maxQuantity) {
            System.out.println(" " + product1.name);
        }
        if (product2.quantity == maxQuantity) {
            System.out.println(" " + product2.name);
        }
        if (product3.quantity == maxQuantity) {
            System.out.println(" " + product3.name);
        }
        if (product4.quantity == maxQuantity) {
            System.out.println(" " + product4.name);
        }
    }
}
