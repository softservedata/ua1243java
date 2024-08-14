package academy.softserve.Homework3.task1;

import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first side: ");
        int side1 = scan.nextInt();

        System.out.println("Enter second side: ");
        int side2 = scan.nextInt();

        System.out.println("Enter third side: ");
        int side3 = scan.nextInt();
        double area = calculateArea(side1, side2, side3);
        System.out.println("Area= "+ area);
    }

    public static double calculateArea(int side1, int side2, int side3) {
        int perimeter = (side1 + side2 + side3) / 2;
        return sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }
}
