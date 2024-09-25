import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class pr2_lesson14 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        long count = primes.stream().count();

        OptionalInt min = primes.stream().mapToInt(Integer::intValue).min();

        OptionalInt max = primes.stream().mapToInt(Integer::intValue).max();

        int sum = primes.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Count: " + count);
        System.out.println("Minimum: " + (min.isPresent() ? min.getAsInt() : "No values"));
        System.out.println("Maximum: " + (max.isPresent() ? max.getAsInt() : "No values"));
        System.out.println("Sum: " + sum);
    }
}
