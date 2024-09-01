package task04;

import java.util.regex.Pattern;

public class NameValidator {
    private static final String NAME_PATTERN = "^[A-Za-z]+([ '-][A-Za-z]+)*$";

    public static boolean isValid(String name){
        return Pattern.matches(NAME_PATTERN, name);
    }
}
