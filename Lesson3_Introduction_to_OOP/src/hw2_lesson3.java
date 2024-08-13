import java.util.Scanner;

public class hw2_lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = sc.nextInt();

        int smallest = findSmallest(firstNumber, secondNumber, thirdNumber);

        System.out.println("The smallest number is " + smallest);
    }

    public static int findSmallest(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }
}
