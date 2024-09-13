
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Date.futureDate();
        var scan = new Scanner(System.in);
        int i = 0;
        while ( i <10) {
            i++;
            try {
                System.out.println("Now, please enter your day: ");
                int day = Integer.parseInt(scan.nextLine());
                System.out.println("Ok!Please enter the month: ");
                int month = Integer.parseInt(scan.nextLine());
                System.out.println("Ok!Please enter the year: ");
                long year = Long.parseLong(scan.nextLine());
                date.printDate(day, month, year);
                date.YearIsLeapOrNot(year);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("It should be integer number!");
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }

    }
}


