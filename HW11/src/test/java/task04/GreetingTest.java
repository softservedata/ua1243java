package task04;

import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreetingTest {
    private static final Pattern GREETING_PATTERN = Pattern.compile(
            "^(Hello|Welcome|Nice to meet you|Greetings|Good day|It's a pleasure to meet you|Hey|Nice to see you|Good to have you with us|Excellent|Glad to welcome you), [A-Za-z]+ [A-Za-z]+!( .*)?$"
    );
    @Test
    public void testGetRandomGreetingContainsName() {
        String firstName = "John";
        String lastName = "Doe";

        String greeting = Greetings.getRandomGreeting(firstName, lastName);

        assertTrue(greeting.contains("John"));
        assertTrue(greeting.contains("Doe"));
    }
    @Test
    public void testGetRandomGreeting() {
        String firstName = "John";
        String lastName = "Doe";

        String greeting = Greetings.getRandomGreeting(firstName, lastName);

        assertTrue(GREETING_PATTERN.matcher(greeting).matches());
        assertTrue(greeting.contains(firstName));
        assertTrue(greeting.contains(lastName));
    }
}
