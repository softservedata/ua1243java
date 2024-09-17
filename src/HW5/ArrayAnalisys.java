package HW5;
import java.util.Scanner;

public class ArrayAnalisys {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[5];
            int minValue = Integer.MAX_VALUE;
            int minPos = -1;
            int secondPositivePos = -1;
            int positiveCount = 0;
            long evenProduct = 1;
            boolean foundEven = false;

            System.out.println("Enter 5 integers:");
            for (int i = 0; i < 5; i++) {
                numbers[i] = scanner.nextInt();

                if (numbers[i] < minValue) {
                    minValue = numbers[i];
                    minPos = i;
                }

                if (numbers[i] > 0) {
                    positiveCount++;
                    if (positiveCount == 2) {
                        secondPositivePos = i;
                    }
                }

                if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                    evenProduct *= numbers[i];
                    foundEven = true;
                }
            }

            if (secondPositivePos != -1) {
                System.out.println("Position of second positive number: " + secondPositivePos);
            } else {
                System.out.println("There is no second positive number.");
            }

            System.out.println("Minimum value: " + minValue + " at position: " + minPos);

            if (foundEven) {
                System.out.println("Product of all even numbers: " + evenProduct);
            } else {
                System.out.println("No even numbers found.");
            }
        }
    }
