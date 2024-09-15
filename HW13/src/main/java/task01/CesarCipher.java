package task01;

import java.util.stream.Collectors;

public class CesarCipher {

    private static final int NUMBER_OF_LETTERS = 26;

    public static String encrypt(String s, int n) {
        return s.chars()
                .mapToObj(c -> shift((char) c, n))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }

    private static char shift(char ch, int n) {
        if (Character.isLetter(ch)) {
            char base = Character.isLowerCase(ch) ? 'a' : 'A';
            return (char) ((ch - base + n + NUMBER_OF_LETTERS) % NUMBER_OF_LETTERS + base);
        } else {
            return ch;
        }
    }
}
