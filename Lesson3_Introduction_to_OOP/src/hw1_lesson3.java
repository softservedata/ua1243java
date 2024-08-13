import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hw1_lesson3 {
    public static double getArea(int side1, int side2, int side3) {
        double perim = (double) (side1 + side2 + side3) /2;
        return sqrt(perim*(perim-side1)*(perim-side2)*(perim-side3));
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int side1 = getNumber("Enter the side 1: ");
        int side2 = getNumber("Enter the side 2: ");
        int side3 = getNumber("Enter the side 3: ");

        System.out.println("The area of the triangle is " + getArea(side1, side2, side3));
    }
}
