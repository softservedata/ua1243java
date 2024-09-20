import java.util.Scanner;

public class pr1_lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int count = 0;

        if (num1 % 2 != 0) {
            count++;
        }
        if (num2 % 2 != 0) {
            count++;
        }
        if (num3 % 2 != 0) {
            count++;
        }

        System.out.println("Number of odd numbers: " + count);
    }
}
