import java.util.Scanner;

public class pr1_lesson12 {
    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("The sides of the rectangle must be non-negative.");
        }
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter the length of the rectangle (a): ");
            String inputA = scan.nextLine();
            System.out.print("Enter the width of the rectangle (b): ");
            String inputB = scan.nextLine();

            int a = Integer.parseInt(inputA);
            int b = Integer.parseInt(inputB);

            int area = squareRectangle(a, b);
            System.out.println("The area of the rectangle is: " + area);

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}
