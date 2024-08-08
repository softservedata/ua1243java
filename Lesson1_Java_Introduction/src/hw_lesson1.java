import java.util.Scanner;

public class hw_lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option to run:");
        System.out.println("1. Calculate perimeter and area of a circle");
        System.out.println("2. Ask for name and address");
        System.out.println("3. Calculate call costs");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                calculateCircleParameters(sc);
                break;
            case 2:
                askNameAndAddress(sc);
                break;
            case 3:
                calculateCallCosts(sc);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    private static void calculateCircleParameters(Scanner sc) {
        System.out.print("Input radius: ");
        double r = sc.nextDouble();
        double pi = 3.14;
        double p = 2 * pi * r;
        double a = pi * r * r;
        System.out.println("Perimeter: " + p);
        System.out.println("Area: " + a);
    }

    private static void askNameAndAddress(Scanner sc) {
        sc.nextLine();
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.print("Where do you live, " + name + "? ");
        String address = sc.nextLine();
        System.out.println(name + " lives in " + address);
    }

    private static void calculateCallCosts(Scanner sc) {
        double c1 = 5;
        double c2 = 6.5;
        double c3 = 2;
        System.out.print("Input duration of the first call: ");
        double t1 = sc.nextDouble();
        System.out.print("Input duration of the second call: ");
        double t2 = sc.nextDouble();
        System.out.print("Input duration of the third call: ");
        double t3 = sc.nextDouble();
        double a1 = c1 * t1;
        double a2 = c2 * t2;
        double a3 = c3 * t3;
        System.out.println("First call cost: " + a1);
        System.out.println("Second call cost: " + a2);
        System.out.println("Third call cost: " + a3);
        double res = a1 + a2 + a3;
        System.out.println("Total cost: " + res);
    }
}
