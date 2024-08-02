import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input side 1: ");
            double firstSide = sc.nextDouble();

            System.out.print("Input side 2: ");
            double secondSide = sc.nextDouble();

            System.out.print("Input side 3: ");
            double thirdSide = sc.nextDouble();

            System.out.printf("The area of the triangle is %.2f", getTriangleArea(firstSide, secondSide, thirdSide));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter valid numbers.");
        }
    }
    public static double getTriangleArea(double firstSide, double secondSide, double thirdSide) {
        if(firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new IllegalArgumentException("Invalid input. Length is a positive value");
        }
        if (firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {
            throw new IllegalArgumentException("Invalid input. These sides do not form a triangle.");
        }
        double p = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }
}
