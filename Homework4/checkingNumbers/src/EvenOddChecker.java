import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EvenOddChecker { // Назва класу відображає його призначення

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[3];
        System.out.println("Please, enter three numbers: ");

        for (int i = 0; i < array.length; i++) {//краще не хардкодити довжину масиву, а використати метод length
            array[i] = scan.nextInt();
            checkEvenOdd(array[i]); // Викликаємо метод для перевірки парності
        }
        scan.close();//закриваємо ресурси
    }

    // Метод для перевірки, чи є число парним винесли окремо і викликаємо в мейн
    private static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }
    }
}