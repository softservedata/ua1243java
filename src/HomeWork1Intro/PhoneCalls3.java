package HomeWork1Intro;

import java.util.Scanner;

public class PhoneCalls3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c1, c2, c3;
        int t1, t2, t3;

        System.out.print("Enter the cost per minute for the first call: ");
        c1 = scanner.nextDouble();
        System.out.print("Enter the duration in minutes for the first call: ");
        t1 = scanner.nextInt();

        System.out.print("Enter the cost per minute for the second call: ");
        c2 = scanner.nextDouble();
        System.out.print("Enter the duration in minutes for the second call: ");
        t2 = scanner.nextInt();

        System.out.print("Enter the cost per minute for the third call: ");
        c3 = scanner.nextDouble();
        System.out.print("Enter the duration in minutes for the third call: ");
        t3 = scanner.nextInt();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double totalCost = cost1 + cost2 + cost3;

        System.out.printf("The cost of the first call: %.2f%n", cost1);
        System.out.printf("The cost of the second call: %.2f%n", cost2);
        System.out.printf("The cost of the third call: %.2f%n", cost3);
        System.out.printf("The total cost of all calls: %.2f%n", totalCost);

        scanner.close();
    }

}
