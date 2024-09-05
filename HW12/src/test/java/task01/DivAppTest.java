package task01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivAppTest {

    @Test
    public void testDivisionValid() {
        assertEquals(2.0, DivApp.division(6.0, 3.0));
        assertEquals(-2.0, DivApp.division(-6.0, 3.0));
        assertEquals(0.0, DivApp.division(0.0, 1.0));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class,
                () -> DivApp.division(6.0, 0.0));
        assertEquals("Division by zero.", exception.getMessage());
    }

}
