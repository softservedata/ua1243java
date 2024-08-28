//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello and welcome! What is your radius ?");
        double radius = scan.nextDouble();
        double area = Math.PI * radius * radius;//Math.PI * Math.pow(radius, 2); як альтернатива піднесення до квадрату
        double length = 2 * Math.PI * radius;

        System.out.println("Area of circle: " + area);
        System.out.print("Length of circle: " + length);
        System.out.println("Thank you!");
        scan.close();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }
}
