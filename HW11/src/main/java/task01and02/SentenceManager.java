package task01and02;

public class SentenceManager {

    private final String [] words;
    private static final int NUMBER_OF_WORDS = 5;
    private static final String REGEX_EXPRESSION = "\\s+";

    public SentenceManager(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Sentence cannot be null");
        }
        this.words = sentence.split(REGEX_EXPRESSION);
        if (words.length != NUMBER_OF_WORDS) {
            throw new IllegalArgumentException("The sentence must contain exactly five words");
        }
    }

    public String getLongestWord() {
        String longestWord = "";
        for(String word: words){
            if (word.length() > longestWord.length())
                longestWord = word;
        }
        return longestWord;
    }

    public String getReversedSecondWord() {
        return new StringBuilder(words[1]).reverse().toString();
    }

    public int getLengthLongestWord(){
        return getLongestWord().length();
    }

    public String getSentenceWithOneSpace(){
        return String.join(" ", words);
    }
}
