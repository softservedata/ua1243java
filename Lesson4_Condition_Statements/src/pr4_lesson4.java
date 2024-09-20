class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class pr4_lesson4 {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, 10);
        Product product2 = new Product("Smartphone", 799.99, 50);
        Product product3 = new Product("Tablet", 499.99, 30);
        Product product4 = new Product("Smartwatch", 199.99, 100);

        Product mostExpensive = product1;
        if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product3;
        }
        if (product4.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product4;
        }

        Product biggestQuantity = product1;
        if (product2.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product2;
        }
        if (product3.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product3;
        }
        if (product4.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product4;
        }

        System.out.println("Most expensive item:");
        System.out.println("Name: " + mostExpensive.getName() + ", Quantity: " + mostExpensive.getQuantity());

        System.out.println("Item with the biggest quantity:");
        System.out.println("Name: " + biggestQuantity.getName());
    }
}
