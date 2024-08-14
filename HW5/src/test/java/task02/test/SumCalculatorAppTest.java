package task02.test;

import org.junit.jupiter.api.Test;
import task02.SumCalculatorApp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumCalculatorAppTest {

    @Test
    public void testCorrectSumAndExit() {
        String input = "10\n20\nN\n";
        String expectedOutput1 = "Enter first number: ";
        String expectedOutput2 = "Enter second number: ";
        String expectedOutput3 = "The sum is: 30";
        String expectedOutput4 = "Program terminated!";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        SumCalculatorApp.runCalculator();

        String actualOutput = out.toString();
        assertTrue(actualOutput.contains(expectedOutput1));
        assertTrue(actualOutput.contains(expectedOutput2));
        assertTrue(actualOutput.contains(expectedOutput3));
        assertTrue(actualOutput.contains(expectedOutput4));
    }

    @Test
    public void testInvalidInput() {
        String input = "10\nabc\n";
        String expectedOutput1 = "Enter first number: ";
        String expectedOutput2 = "You entered an invalid number.";
        String expectedOutput3 = "Program terminated!";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        System.setErr(new PrintStream(err));

        SumCalculatorApp.runCalculator();

        String actualOutput = out.toString();
        String actualError = err.toString();

        assertTrue(actualOutput.contains(expectedOutput1));
        assertTrue(actualError.contains(expectedOutput2));
        assertTrue(actualOutput.contains(expectedOutput3));
    }


    @Test
    public void testMultipleRuns() {
        String input = "10\n20\nY\n30\n40\nN\n";
        String expectedOutput1 = "Enter first number: ";
        String expectedOutput2 = "The sum is: 30";
        String expectedOutput3 = "The sum is: 70";
        String expectedOutput4 = "Program terminated!";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        SumCalculatorApp.runCalculator();

        String actualOutput = out.toString();
        assertTrue(actualOutput.contains(expectedOutput1));
        assertTrue(actualOutput.contains(expectedOutput2));
        assertTrue(actualOutput.contains(expectedOutput3));
        assertTrue(actualOutput.contains(expectedOutput4));
    }
}
