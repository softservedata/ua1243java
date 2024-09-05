package task02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class ReadNumberAppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testReadNumberValidInput() {
        String input = "10\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        int result = ReadNumberApp.readNumber(scanner, 1, 100);
        assertEquals(10, result);
    }

    @Test
    public void testReadNumberOutOfRange() {
        String input = "200\n50\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        assertThrows(NumberOutOfRangeException.class, () -> ReadNumberApp.readNumber(scanner, 1, 100));

        int result = ReadNumberApp.readNumber(scanner, 1, 100);
        assertEquals(50, result);
    }


    @Test
    public void testReadNumberInvalidInput() {
        String input = "abc\n10\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        int result = ReadNumberApp.readNumber(scanner, 1, 100);
        assertTrue(outContent.toString().contains("Invalid input. Please enter an integer."));
        assertEquals(10, result);
    }

    @Test
    public void testMainValidSequence() {
        String input = "2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ReadNumberApp.main(null);

        assertTrue(outContent.toString().contains("You entered a valid sequence of numbers"));
        assertTrue(outContent.toString().contains("[2, 3, 4, 5, 6, 7, 8, 9, 10, 11]"));
    }
}
