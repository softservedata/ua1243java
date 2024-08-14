package academy.softserve.Homework1;

import java.util.Scanner;

public class Homework_Task3 {
    public static void main(String[] args) {
        /*
        Three phone calls were made from different countries,
        each with a different cost per minute (c1, c2, and c3)
        and duration (t1, t2, and t3). Input all the source data from the console,
        calculate the cost of each call and the total cost,
        and output the results to the console
         */

//        costs per minute
        double c1, c2, c3;
//        duration
        double t1, t2, t3;

        Scanner scan = new Scanner(System.in);
        System.out.println("How much does it cost 1 minute calling in a \"country 1\"?");
        c1= scan.nextDouble();
        System.out.println("How long did you talked? (minutes)");
        t1 = scan.nextDouble();
        System.out.println("How much does it cost 1 minute calling in a \"country 2\"?");
        c2= scan.nextDouble();
        System.out.println("How long did you talked? (minutes)");
        t2 = scan.nextDouble();
        System.out.println("How much does it cost 1 minute calling in a \"country 3\"?");
        c3= scan.nextDouble();
        System.out.println("How long did you talked? (minutes)");
        t3 = scan.nextDouble();

//        How much did this calling cost
        double sum1, sum2, sum3;
        sum1 = c1*t1;
        sum2 = c2*t2;
        sum3 = c3*t3;

        System.out.println("First country calling costed "+sum1+"$");
        System.out.println("Second country calling costed "+sum2+"$");
        System.out.println("Third country calling costed "+sum3+"$");
    }
}
