import java.util.function.Predicate;

public class pr4_lesson13 {
    public static int count(Integer[] array, Predicate<Integer> condition) {
        int count = 0;
        for (Integer element : array) {
            if (condition.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = count(numbers, n -> n > 5);

        System.out.println("Count of numbers greater than 5: " + result);

        int evenCount = count(numbers, n -> n % 2 == 0);
        System.out.println("Count of even numbers: " + evenCount);
    }
}
