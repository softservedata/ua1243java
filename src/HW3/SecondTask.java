package HW3;

import java.util.Scanner;

public class SecondTask{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Input second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Input third number: ");
        double number3 = scanner.nextDouble();

        double thesmallestnumber = findNumber(number1, number2, number3);
        System.out.printf("The smallest number is " + thesmallestnumber);
    }

    public static double findNumber(double a, double b, double c) {
        if (a<b && a<c){
            return a;
        }

        else if (b<a && b<c) {
            return b;
        }

        else {
            return c;
        }

    }
}

