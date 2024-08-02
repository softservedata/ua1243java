package com.softserve.edu.orest.hw1;

//Three phone calls were made from different countries, each with a different cost per
//minute (c1, c2, and c3) and duration (t1, t2, and t3). Input all the source data from the
//console, calculate the cost of each call and the total cost, and output the results to the
//console.

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What was the duration of your calls?");
        double c1 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        double c3 = scanner.nextDouble();

        System.out.println("Tell me the costs per minute of those calls");
        double t1 = scanner.nextDouble();
        double t2 = scanner.nextDouble();
        double t3 = scanner.nextDouble();

        double p1 = c1 * t1;
        double p2 = c2 * t2;
        double p3 = c3 * t3;
        double p = p1 + p2 + p3;

        System.out.println("The cost of the first call is " + p1);
        System.out.println("The cost of the second call is " + p2);
        System.out.println("The cost of the third call is " + p3);

        System.out.println("The total cost is " + p);
    }
}
