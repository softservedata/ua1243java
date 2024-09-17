package HW5;
import java.util.Scanner;

public class SumOfProduct {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[10];
            int sum = 0;
            long product = 1;
            boolean allPositive = true;

            System.out.println("Enter 10 integers:");
            for (int i = 0; i < 10; i++) {
                numbers[i] = scanner.nextInt();
                if (i < 5 && numbers[i] > 0) {
                    sum += numbers[i];
                } else if (i < 5) {
                    allPositive = false;
                }
                if (i >= 5) {
                    product *= numbers[i];
                }
            }

            if (allPositive) {
                System.out.println("Sum of first five elements: " + sum);
            } else {
                System.out.println("Product of last five elements: " + product);
            }
        }
    }
