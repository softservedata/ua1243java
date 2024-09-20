import java.util.Scanner;

public class hw1_lesson4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float num1 = scan.nextFloat();

        System.out.println("Enter the float number:");
        float num2 = scan.nextFloat();

        System.out.println("Enter the third number:");
        float num3 = scan.nextFloat();

        if (isInRange(num1) && isInRange(num2) && isInRange(num3)) {
            System.out.println("True. All numbers belong to the range [-5, 5].");
        } else {
            System.out.println("False. Not all numbers belong to the range [-5, 5].");
        }

        scan.close();
    }

    public static boolean isInRange(float number) {
        return number >= -5 && number <= 5;
    }
}
