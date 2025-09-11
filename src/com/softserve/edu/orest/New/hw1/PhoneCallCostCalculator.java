package com.softserve.edu.orest.New.hw1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What was the cost of the first call? ");
        double c1 = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("What was the duration of the first call? ");
        double t1 = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("What was the cost of the second call? ");
        double c2 = scanner3.nextDouble();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("What was the duration of the second call? ");
        double t2 = scanner4.nextDouble();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("What was the cost of the third call? ");
        double c3 = scanner5.nextDouble();
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("What was the duration of the third call? ");
        double t3 = scanner6.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double totalCost = cost1 + cost2 + cost3;

        System.out.println("The cost of the first call was: " + cost1);
        System.out.println("The cost of the second call was: " + cost2);
        System.out.println("The cost of the third call was: " + cost3);
        System.out.println("The total cost was: " + totalCost);

    }
}
