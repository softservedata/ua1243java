import java.util.Scanner;

public class pr_lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option to run:");
        System.out.println("1. Reverse three words");
        System.out.println("2. Calculate average of three numbers");
        System.out.println("3. Arithmetic operations (addition, subtraction, multiplication, division)");
        System.out.println("4. How are you?");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                reverseWords(sc);
                break;
            case 2:
                calculateAverage(sc);
                break;
            case 3:
                arithmeticOperations(sc);
                break;
            case 4:
                howAreYou(sc);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public static void reverseWords(Scanner sc) {
        System.out.print("Input first word: ");
        String one = sc.nextLine();
        System.out.print("Input second word: ");
        String two = sc.nextLine();
        System.out.print("Input third word: ");
        String three = sc.nextLine();
        System.out.println("Output text: ");
        System.out.println(three + "\n" + two + "\n" + one);
    }

    public static void calculateAverage(Scanner sc) {
        System.out.print("Input first number: ");
        int one = sc.nextInt();
        System.out.print("Input second number: ");
        int two = sc.nextInt();
        System.out.print("Input third number: ");
        int three = sc.nextInt();
        float average = (float) (one + two + three) / 3;
        System.out.print("Average is ");
        System.out.println(average);
    }

    public static void arithmeticOperations(Scanner sc) {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int plus = a + b;
        int minus = a - b;
        int multi = a * b;
        int divide = a / b;
        System.out.println("a + b = " + plus);
        System.out.println("a - b = " + minus);
        System.out.println("a * b = " + multi);
        System.out.println("a / b = " + divide);
    }

    public static void howAreYou(Scanner sc) {
        System.out.print("How are you? ");
        String a = sc.nextLine();
        System.out.println("You are " + a);
    }
}
