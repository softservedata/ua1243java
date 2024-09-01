package task04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NameValidatorTest {
    @Test
    public void testValidNames() {
        assertTrue(NameValidator.isValid("John"));
        assertTrue(NameValidator.isValid("Mary Jane"));
        assertTrue(NameValidator.isValid("Anne-Marie"));
        assertTrue(NameValidator.isValid("O'Connor"));
        assertTrue(NameValidator.isValid("John Smith"));
        assertTrue(NameValidator.isValid("Alice Wonderland"));
        assertTrue(NameValidator.isValid("Jean-Luc"));
    }

    @Test
    public void testInvalidNames() {
        assertFalse(NameValidator.isValid("John123"));
        assertFalse(NameValidator.isValid("Mary@Jane"));
        assertFalse(NameValidator.isValid("Anne_Marie"));
        assertFalse(NameValidator.isValid("O'Connor123"));
        assertFalse(NameValidator.isValid("   "));
        assertFalse(NameValidator.isValid("12345"));
        assertFalse(NameValidator.isValid(" "));
        assertFalse(NameValidator.isValid("!@#$%"));
        assertFalse(NameValidator.isValid("John-"));
    }
}
