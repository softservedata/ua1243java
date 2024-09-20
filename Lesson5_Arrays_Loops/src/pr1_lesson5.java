import java.util.Arrays;
import java.util.Scanner;

public class pr1_lesson5 {
    public static void main(String[] args) {
        String[] strArr = {"Banana", "Apple", "Cherry", "Potato", "Blueberry"};
        Arrays.sort(strArr);
        System.out.println("Sorted String Arr: " + Arrays.toString(strArr));

        int[] intArr = {10, 40, 60, 80, 100};
        double average = calculateAverage(intArr);
        System.out.println("Average of intArr: " + average);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value to search in the arr: ");
        int valueToSearch = scan.nextInt();
        boolean containsValue = containsValue(intArr, valueToSearch);
        System.out.println("Does intArr contain " + valueToSearch + "? " + containsValue);
        scan.close();
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static boolean containsValue(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
