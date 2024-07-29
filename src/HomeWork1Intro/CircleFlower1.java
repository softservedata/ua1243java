package HomeWork1Intro;

import java.util.Scanner;

/*Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
 from the console, and output obtained results. */

public class CircleFlower1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the radius of the flower bed: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The perimeter (circumference) of the flower bed is: %.2f%n", perimeter);
        System.out.printf("The area of the flower bed is: %.2f%n", area);
        scanner.close();
    }
}

