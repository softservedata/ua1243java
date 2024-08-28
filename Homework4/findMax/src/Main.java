import java.util.Scanner;

/*Ініціалізувати maximum і minimum значенням з array[0] не буде працювати коректно,
 оскільки на початку масив array заповнений нулями,
 і ти порівнюєш введені значення з нулем, що може призвести до некоректних результатів.*/
public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the three numbers: ");


        //напишите тут ваш код
        int[] array = new int[3];
        int maximum = array[0];
        int minimum = array[0];


        for (int i = 0; i < 3; i++) {

            array[i] = Integer.parseInt(scan.nextLine());
            if (array[i] > maximum) {
                maximum = array[i];
            } else if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println("Max value is " + maximum);
        System.out.println("Min value is " + minimum);


    }

        /*
        if (a > b && b > c) {
            System.out.println("Max value  is: " +a);
            System.out.println("Min value  is: " +c);
        } else if (a > b &&  b<c) {
            System.out.println("Max value  is: " +a);
            System.out.println("Min value  is: " +b);

        } else if (b > c && c>a) {
            System.out.println("Max value  is: "+ b);
            System.out.println("Min value  is: " +a);

        }else if (b > c && c<a) {
            System.out.println("Max value  is: "+ b);
            System.out.println("Min value  is: " +c);

        }
        else if(c>b && b>a) {
            System.out.println("Max value  is: "+ c);
            System.out.println("Min value is: " + a);


        }
        else if (a<c  && b<c )  {
            System.out.println("Max value  is: "+ c);
            System.out.println("Min value is: " + b);
        }

*/

}
//перероблено
class FindMaxMinValues {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please, enter three numbers: ");
        int[] array = new int[3];
        // Ініціалізація масиву і максимального та мінімального значень першими значеннями, які вводить користувач
        array[0] = Integer.parseInt(scan.nextLine());
        int maximum = array[0];
        int minimum  = array[0];
        // Введення наступних чисел та оновлення максимальних і мінімальних значень
        for (int i = 1; i < array.length; i++) { // Починаємо з 1, оскільки 0 вже заповнений
            array[i] = Integer.parseInt(scan.nextLine());
            if (array[i] > maximum) {
                maximum = array[i];
            }
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        //як альтернатива
        // Використання Math.max і Math.min для порівняння значень
//        for (int i = 1; i < array.length; i++) {
//            maximum = Math.max(maximum, array[i]);
//            minimum = Math.min(minimum, array[i]);
//        }

        System.out.println("Max value is " + maximum);
        System.out.println("Min value is " + minimum);

        scan.close();
    }
    //ще можна було додати перевірку чи не є всі три введенні числа однаковими
}