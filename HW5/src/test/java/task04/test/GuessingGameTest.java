package task04.test;

import org.junit.jupiter.api.Test;
import task04.GuessingGame;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessingGameTest {

    @Test
    public void testCorrectGuess() {
        GuessingGame game = new GuessingGame();
        game.setRandomNumber(42);

        String input = "50\n30\n42\n";
        String expectedOutput1 = "Enter your guess (0 - 99): ";
        String expectedOutput2 = "Too high, try again.";
        String expectedOutput3 = "Too low, try again.";
        String expectedOutput4 = "Congratulations! You guessed it!";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        game.startGame();

        String actualOutput = out.toString();

        assertTrue(actualOutput.contains(expectedOutput1));
        assertTrue(actualOutput.contains(expectedOutput2));
        assertTrue(actualOutput.contains(expectedOutput3));
        assertTrue(actualOutput.contains(expectedOutput4));
    }

    @Test
    public void testInputOutOfRange() {
        GuessingGame game = new GuessingGame();
        game.setRandomNumber(25);

        String input = "150\n10\n25\n";
        String expectedOutput1 = "Enter your guess (0 - 99): ";
        String expectedOutput2 = "Guess number out of range: (0 - 99)";
        String expectedOutput3 = "Too low, try again.";
        String expectedOutput4 = "Congratulations! You guessed it!";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        game.startGame();

        String actualOutput = out.toString();

        assertTrue(actualOutput.contains(expectedOutput1));
        assertTrue(actualOutput.contains(expectedOutput2));
        assertTrue(actualOutput.contains(expectedOutput3));
        assertTrue(actualOutput.contains(expectedOutput4));
    }

    @Test
    public void testInvalidInput() {
        GuessingGame game = new GuessingGame();
        game.setRandomNumber(77);

        String input = "abc\n77\n";
        String expectedOutput1 = "Enter your guess (0 - 99): ";
        String expectedOutput2 = "You entered an invalid number.";
        String expectedOutput3 = "Congratulations! You guessed it!";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayOutputStream err = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));
        System.setErr(new PrintStream(err));

        game.startGame();

        String actualOutput = out.toString();
        String actualError = err.toString();

        assertTrue(actualOutput.contains(expectedOutput1));
        assertTrue(actualError.contains(expectedOutput2));
        assertTrue(actualOutput.contains(expectedOutput3));
    }
}
