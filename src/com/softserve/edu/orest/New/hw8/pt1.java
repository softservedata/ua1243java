package com.softserve.edu.orest.New.hw8;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class pt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the first side of rectangle");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the second side of rectangle");
                int b = Integer.parseInt(scanner.nextLine());
                int area = squareRectangle(a, b);
                System.out.println("The area of rectangle is " + area);
                break;
            } catch (NumberFormatException e2) {
                System.out.println("Side should be a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException("Side cant be negative");
        }
        return a * b;
    }
}
