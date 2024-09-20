import java.util.Scanner;

public class hw2_lesson5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeat;

        do {
            System.out.print("Enter the first number: ");
            double num1 = scan.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scan.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to perform the operation again? (y/n): ");
            repeat = scan.next().charAt(0);
        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("Stop program....");
    }
}
