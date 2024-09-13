import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Date {
    void printDate  (int day, int month, long year) throws IllegalArgumentException {

        if (day <= 0 || day > 31) {
            throw new IllegalArgumentException("Number of day can not be negative!");
        }
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Number of month has to be  in range [1;12]!");
        }
        if (year <= 0 ) {
            throw new IllegalArgumentException("Number of year can not be negative!");
        } else {
            System.out.printf( "%02d.%02d.%2d", day,month,year);
            System.out.println(" ");
        }
    }

             public  void YearIsLeapOrNot( long year){
         if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
             System.out.println(" Year " + year + " is a leap year.");
         else
             System.out.println("Year " + year + " is not a leap year.");

         }
          public  static void futureDate(){
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
              LocalDate birthday = LocalDate.parse("09.01.1998", formatter);
              System.out.println("Hello! My birthday is "+birthday);
              LocalDate localDate2 = birthday.plusYears(1);
              LocalDate localDate1 = birthday.plusMonths(6);
              System.out.println("6 month later:  "+localDate1);
              System.out.println("1 year later:  "+localDate2);

          }
}

