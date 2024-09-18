package homework.dmytro.livantsov.homeW_1.correct;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class FlowerBedCalculator {
    static final double PI = 3.14;

    public static void main(String[] args) {
        // double pi = 3.14159;//it's not good, use lib Math for this
        //or do it as constant
        Scanner scanner = new Scanner(in);
        out.print("Write radius - ");
        int radius = scanner.nextInt();
        double perimeter = 2 * Math.PI * radius;//use lib Math for this
        out.println("Perimeter is: " + perimeter);
        double area = 2 * Math.PI * Math.pow(radius,2);
        out.println("Area is: " + area);
        scanner.close();
        //
    }
}
