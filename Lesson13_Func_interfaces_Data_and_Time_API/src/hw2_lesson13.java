import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class hw2_lesson13 {
    public static boolean validateDate(String date) {
        String dateFormat = "^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.(\\d{2})$";

        if (!date.matches(dateFormat)) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yy");
        sdf.setLenient(false);

        try {
            Date parsedDate = sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    public static boolean validateDate2(String date) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM.dd.yy");

        try {
            LocalDate parsedDate = LocalDate.parse(date, dateFormatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String date1 = "09.25.24";
        String date2 = "13.30.24";
        String date3 = "13.01.24";

        System.out.println(date1 + " is valid: " + validateDate(date1));
        System.out.println(date2 + " is valid: " + validateDate(date2));
        System.out.println(date3 + " is valid: " + validateDate(date3));

        System.out.println(date1 + " is valid: " + validateDate2(date1));
        System.out.println(date2 + " is valid: " + validateDate2(date2));
        System.out.println(date3 + " is valid: " + validateDate2(date3));
    }
}
