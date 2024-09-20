import java.util.Scanner;

public class hw2_lesson4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scan.nextInt();

        //Max value
        int max;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        //Min value
        int min;
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }

        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);

        scan.close();
    }
}
