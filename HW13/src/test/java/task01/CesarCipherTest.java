package task01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CesarCipherTest {

    private static final int SHIFT = 3;

    @Test
    public void testEncrypt() {
        assertEquals("Khoor Zruog", CesarCipher.encrypt("Hello World", SHIFT));
        assertEquals("khoor", CesarCipher.encrypt("hello", SHIFT));
        assertEquals("Wklv lv d whvw phvvdjh", CesarCipher.encrypt("This is a test message", SHIFT));
        assertEquals("1234!@#", CesarCipher.encrypt("1234!@#", SHIFT));
    }

    @Test
    public void testDecrypt() {
        assertEquals("Hello World", CesarCipher.decrypt("Khoor Zruog", SHIFT));
        assertEquals("hello", CesarCipher.decrypt("khoor", SHIFT));
        assertEquals("This is a test message", CesarCipher.decrypt("Wklv lv d whvw phvvdjh", SHIFT));
        assertEquals("1234!@#", CesarCipher.decrypt("1234!@#", SHIFT));
    }

    @Test
    public void testEncryptDecryptConsistency() {
        String original = "Test Message";
        String encrypted = CesarCipher.encrypt(original, SHIFT);
        String decrypted = CesarCipher.decrypt(encrypted, SHIFT);
        assertEquals(original, decrypted);
    }

    @Test
    public void testNegativeShift() {
        int negativeShift = -3;
        assertEquals("Hello World", CesarCipher.decrypt(CesarCipher.encrypt("Hello World", negativeShift), negativeShift));
    }
}

