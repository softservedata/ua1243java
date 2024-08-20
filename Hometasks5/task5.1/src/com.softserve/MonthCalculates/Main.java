package MonthCalculates;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please, enter the number of month: ");
      int numberOfMonth = SCANNER.nextInt();
      String [] namesOfMonth = {"No month","January - 31 days ","February 28 days in a common year and 29 days in leap years",
              "March- 31 days","April - 30 days","May- 31 days","June - 30 days","July - 31 days","August - 31 days","September - 30 days","October - 31 days","November - 30 days","December - 31 days"};

        System.out.println("The number of days in this month: "+namesOfMonth[numberOfMonth]);
    }
}