package com.softserve.edu.orest.New.hw6;

public class ApplianceApp {
    public static void main(String[] args) {

        Appliance[] appliances = {
                new WashingMachine("LG", "TWINWash", 15),
                new Refrigerator("Samsung", "Family Hub", 600)
        };
        for (Appliance appliance : appliances) {
            appliance.displayInfo();
        }
    }
}
