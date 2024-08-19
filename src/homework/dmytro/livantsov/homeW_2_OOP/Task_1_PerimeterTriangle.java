package homework.dmytro.livantsov.homeW_2_OOP;

import java.util.Scanner;

public class Task_1_PerimeterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aSide;
        double bSide;
        double cSide;

        System.out.println("Write side A of triangle in cm");
        aSide = scanner.nextDouble();
        System.out.println("Write side B of triangle in cm");
        bSide = scanner.nextDouble();
        System.out.println("Write side C of triangle in cm");
        cSide = scanner.nextDouble();

        double result = areaOfTriangle(aSide, bSide, cSide);
        String formattedResult = String.format("%.2f", result);
        System.out.println("The area of the triangle is = " + formattedResult);

    }

    /*
    Formula
    Three sides (SSS)
        If you know the lengths of all sides, use the Heron's formula:
        area = 0.25 × √( (a + b + c) × (-a + b + c) × (a - b + c) × (a + b - c) )
     */
    public static double areaOfTriangle(double firstSide, double secondSide, double thirdSide){
        return (double) 0.25 *  Math.sqrt((firstSide + secondSide + thirdSide) *
                (-firstSide + secondSide + thirdSide) *
                (firstSide - secondSide + thirdSide) *
                (firstSide + secondSide - thirdSide));
    }
}
