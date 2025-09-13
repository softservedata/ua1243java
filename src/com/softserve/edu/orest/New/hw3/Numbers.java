package com.softserve.edu.orest.New.hw3;

import java.util.Scanner;

public class Numbers {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int number1 = getNumber("Enter the first number ");
        int number2 = getNumber("Enter the second number ");
        int sum = getTotal(number1, number2);
        double average = getAverage(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
        System.out.println("The average of " + number1 + " and " + number2 + " is " + average);

    }

    private static int getTotal(int number1, int number2){
        return number1 + number2;
    }
    private static double getAverage(int number1, int number2){
        return (double) getTotal(number1, number2) / 2;
    }
    private static int getNumber(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(SCANNER.nextLine());
    }
}

