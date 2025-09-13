package com.softserve.edu.orest.New.hw3;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        double fah = getFah("What is the temperature in degrees Fahrenheit? ");
        double cel = fahrenheitToCelsius(fah);

        System.out.println("The temp in cel is: " + cel);
    }

    public static double getFah(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public static double fahrenheitToCelsius(double fah){
        return (fah - 32) * 5 / 9;
    }
}
