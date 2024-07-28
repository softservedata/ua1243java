import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("/Homework/");
        System.out.println("First");
        System.out.println("Input radius:");
        double radius = scanner.nextDouble();
        System.out.println("Perimeter: " + 2 * Math.PI * radius);
        System.out.println("Area: " + Math.PI * Math.pow(radius,2));

        System.out.println("Second");
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Where do you live, " + name + " ?");
        String address = scanner.next();
        System.out.println("Complete information:");
        System.out.println(name + " " + address);

        System.out.println("Third");
        System.out.println("Input c1: ");
        double c1 = scanner.nextDouble();
        System.out.println("Input c2: ");
        double c2 = scanner.nextDouble();
        System.out.println("Input c3: ");
        double c3 = scanner.nextDouble();

        System.out.println("Input t1: ");
        double t1 = scanner.nextDouble();
        System.out.println("Input t2: ");
        double t2 = scanner.nextDouble();
        System.out.println("Input t3: ");
        double t3 = scanner.nextDouble();

        System.out.println("Cost first call: " + c1 * t1);
        System.out.println("Cost second call: " + c2 * t2);
        System.out.println("Cost third call: " + c3 * t3);
        System.out.println("Total cost: " + (c1 * t1 + c2 * t2 + c3 * t3));

    }
}