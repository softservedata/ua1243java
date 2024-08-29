package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main (String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please write cost per minute for first country");
        double c1 = Double.parseDouble(reader.readLine());

        System.out.println("Please write duration for first country");
        double t1 = Double.parseDouble(reader.readLine());

        System.out.println("Please write cost per minute for second country");
        double c2 = Double.parseDouble(reader.readLine());

        System.out.println("Please write duration for second country");
        double t2 = Double.parseDouble(reader.readLine());

        System.out.println("Please write cost per minute for third country");
        double c3 = Double.parseDouble(reader.readLine());

        System.out.println("Please write duration for third country");
        double t3 = Double.parseDouble(reader.readLine());

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalcost = cost1 + cost2 + cost3;

        System.out.println("Cost of first call is " + cost1);
        System.out.println("Cost of second call is " + cost2);
        System.out.println("Cost of third call is " + cost3);
        System.out.println("Total cost of all calls is " + totalcost);

    }
}
