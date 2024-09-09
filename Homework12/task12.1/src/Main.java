import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        var scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please, enter the first number: ");

                double a = Double.parseDouble(scan.nextLine());
                System.out.println("Please, enter the second number: ");

                double b = Double.parseDouble(scan.nextLine());
                String formattedDouble = String.format("%.2f", div(a,b));
                System.out.println("Result: " + formattedDouble);
                break;
            }catch (NumberFormatException ex){
                System.out.println("It should be a number!");
            }
            catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static double div ( double a, double b) throws IllegalAccessException {
                if (b == 0) {
                    throw new IllegalAccessException("Division by zero is not allowed!");
                }
                return a / b;
    }
        }

