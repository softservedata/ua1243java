package task04;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputHandlerTest {

    private UserInputHandler userInputHandler;
    private final InputStream originalSystemIn = System.in;

    @Test
    public void testValidNameInput() {
        String input = "john\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        userInputHandler = new UserInputHandler(new Scanner(System.in));
        String result = userInputHandler.promptAndValidateName("first name");

        assertEquals("John", result);

        System.setIn(originalSystemIn);
    }

    @Test
    public void testInvalidNameInput() {
        String input = "123\nmary\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        userInputHandler = new UserInputHandler(new Scanner(System.in));
        String result = userInputHandler.promptAndValidateName("first name");

        assertEquals("Mary", result);
        System.setIn(originalSystemIn);
    }

    @Test
    public void testEmptyNameInput() {
        String input = " \nAlice\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        userInputHandler = new UserInputHandler(new Scanner(System.in));
        String result = userInputHandler.promptAndValidateName("last name");

        assertEquals("Alice", result);
        System.setIn(originalSystemIn);
    }

    @Test
    public void testNameWithSpecialCharacter() {
        String input = "Mary-Jane\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        userInputHandler = new UserInputHandler(new Scanner(System.in));
        String result = userInputHandler.promptAndValidateName("first name");

        assertEquals("Mary-Jane", result);
        System.setIn(originalSystemIn);
    }
}
