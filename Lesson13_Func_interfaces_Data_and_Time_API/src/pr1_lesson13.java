import java.time.DayOfWeek;
import java.time.LocalDate;

public class pr1_lesson13 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        System.out.println("Today is: " + currentDate + " " + dayOfWeek);
    }
}
