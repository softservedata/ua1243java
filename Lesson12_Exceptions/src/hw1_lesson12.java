import java.util.Scanner;

public class hw1_lesson12 {
    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double a = scan.nextDouble();
            System.out.print("Enter second number: ");
            double b = scan.nextDouble();

            double result = div(a, b);
            System.out.println("The result division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
