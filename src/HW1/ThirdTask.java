package HW1;

import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Input second side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Input third side: ");
        double side3 = scanner.nextDouble();

        double area = calculateArea(side1, side2, side3);
        System.out.printf("The area of the triangle is " + area);
    }

    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
