package com.softserve.edu.orest.New.hw6;

public class PreferredCustomer extends Customer {
    private double discountRate;

    public double getDiscountRate() {
        return discountRate;
    }

    public PreferredCustomer(String name, String email, int maxPurchase, double discountRate) {
        super(name, email, maxPurchase);
        this.discountRate = discountRate;
    }

    int applyDiscount(int amount) {
        double discountedAmount = amount * (1.0 - discountRate);
        return (int) discountedAmount;
    }

    void addPurchase(int amount) {
        if (purchaseCount < purchaseHistory.length) {
            int discountedAmount = applyDiscount(amount);
            purchaseHistory[purchaseCount] = discountedAmount;
            purchaseCount++;
        }
    }

    void displayPurchaseHistory() {
        System.out.println("Purchase History for " + getName() + " :");
        if (purchaseCount == 0) {
            System.out.println("No purchases to display.");
            return;
        }

        for (int i = 0; i < purchaseCount; i++) {
            System.out.println("Purchase " + (i + 1) + ": " + purchaseHistory[i]);
        }
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Total Expenditure (after discount): " + calculateTotalExpenditure());
    }
}
