package com.softserve.edu.orest.New.hw6;

import java.util.Arrays;

public class Customer {
    private String name;
    private String email;
    int[] purchaseHistory;
    int purchaseCount;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, String email, int maxPurchases) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new int[maxPurchases];
        this.purchaseCount = 0;
    }
    void addPurchase(int amount) {
        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
            System.out.println("Added");
        } else {
            System.out.println("The array is full.");
        }
    }

    int calculateTotalExpenditure() {
        int total = 0;
        for (int i : purchaseHistory) {
            total += purchaseHistory[i];
        }
        return total;
    }

    void displayPurchaseHistory() {
        System.out.println("Purchase History for " + name);
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println("Purchase " + (i + 1) + ": $" + purchaseHistory[i]);
        }
        System.out.println("Total Expenditure: " + calculateTotalExpenditure());
    }
}
