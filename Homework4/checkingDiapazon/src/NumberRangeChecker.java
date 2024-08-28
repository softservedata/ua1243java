import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NumberRangeChecker {// намагайся іменувати класи так щоб вони відображали суть того для чого він призначений

    // Константи для меж діапазону для того щоб якщо зміниться значення була одна точка входу зміни
    private static final float LOWER_BOUND = -5.0f;
    private static final float UPPER_BOUND = 5.0f;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float[] array = new float[3];
        System.out.println("Please, enter three numbers: ");

        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextFloat();
            checkNumberInRange(array[i]); // Викликаємо метод для перевірки числа
        }

        scan.close();
    }

    // Метод для перевірки, чи належить число до діапазону винесли окремо, для того щоб простіше було тестувати
    private static void checkNumberInRange(float number) {
        if (number >= LOWER_BOUND && number <= UPPER_BOUND) {// додала щоб -5,+5 входили в діапазон
            System.out.println("This number belongs to the range [" + LOWER_BOUND + ";" + UPPER_BOUND + "].");
        } else {
            System.out.println("This number is out of the range [" + LOWER_BOUND + ";" + UPPER_BOUND + "].");
        }
    }
}