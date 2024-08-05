package HomeWork3OOP;

import java.util.Scanner;

/*Write Java console application with method to
calculate the area of a triangle.*/

public class AreaOfATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first side: ");
        int side1 = scanner.nextInt();

        System.out.println("Input the second side: ");
        int side2 = scanner.nextInt();

        System.out.println("Input the third side: ");
        int side3 = scanner.nextInt();

        double area = calculateArea(side1, side2, side3);

        System.out.println("The area is :  " + area);


    }

    public static double calculateArea(double num1, double num2, double num3) {
        double result = 0;

        if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1) {
            double semiPerimeter = (num1 + num2 + num3) / 2.0;
            result = Math.sqrt(semiPerimeter * (semiPerimeter - num1) * (semiPerimeter - num2) * (semiPerimeter - num3));
        }
        return result;

    }
}