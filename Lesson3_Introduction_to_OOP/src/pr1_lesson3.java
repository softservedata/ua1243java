import java.util.Scanner;

public class pr1_lesson3 {
    public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static double getAverage(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int num1 = getNumber("Enter the first number: ");
        int num2 = getNumber("Enter the second number: ");

        int total = getTotal(num1, num2);
        double average = getAverage(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + total);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + average);
    }
}
