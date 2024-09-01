package task03;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyPatternMatcher {
    private static final String REGEX_PATTERN = "\\$\\d+\\.\\d{2}\\b";
    private final Pattern pattern;

    public CurrencyPatternMatcher() {
        pattern = Pattern.compile(REGEX_PATTERN);
    }

    public List<String> currencyMatches(String text){
        Matcher matcher = pattern.matcher(text);
        List<String> matches = new ArrayList<>();
        while (matcher.find()){
            matches.add(matcher.group());
        }
        return matches;
    }
}
