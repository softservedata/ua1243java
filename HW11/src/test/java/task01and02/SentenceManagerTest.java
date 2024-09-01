package task01and02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SentenceManagerTest {

    @Test
    public void testConstructorWithValidSentence() {
        SentenceManager manager = new SentenceManager("one two three four five");

        assertEquals("three", manager.getLongestWord());
        assertEquals(5, manager.getLengthLongestWord());
        assertEquals("owt", manager.getReversedSecondWord());
    }

    @Test
    public void testConstructorWithNullSentence() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new SentenceManager(null));
        assertEquals("Sentence cannot be null", exception.getMessage());
    }

    @Test
    public void testConstructorWithTooFewWords() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new SentenceManager("one two three four"));
        assertEquals("The sentence must contain exactly five words", exception.getMessage());
    }

    @Test
    public void testConstructorWithTooManyWords() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new SentenceManager("one two three four five six"));
        assertEquals("The sentence must contain exactly five words", exception.getMessage());
    }

    @Test
    public void testGetLongestWordWhenAllWordsAreSameLength() {
        SentenceManager manager = new SentenceManager("apple pears mango limes kiwis");
        assertEquals("apple", manager.getLongestWord());
    }

    @Test
    public void testGetReversedSecondWord() {
        SentenceManager manager = new SentenceManager("hello world this is java");
        assertEquals("dlrow", manager.getReversedSecondWord());
    }

    @Test
    public void testGetSentenceWithOneSpace(){
        SentenceManager manager = new SentenceManager("I     am    learning    Java     Fundamental");
        assertEquals("I am learning Java Fundamental", manager.getSentenceWithOneSpace());
    }
}
