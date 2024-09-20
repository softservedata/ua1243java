import java.util.Scanner;

public class pr2_lesson5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();

        if (number <= 1) {
            System.out.println("Is not a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Is a prime number");
            } else {
                System.out.println("Is not a prime number");
            }
        }
        scan.close();
    }
}
