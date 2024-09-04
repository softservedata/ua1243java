package task1;

public class StringOperations {
    public StringBuilder reverseOrder(String str){
        String[] words = str.split(" ");
        String word = words[1];
        return new StringBuilder(word).reverse();
    }
    public String findLongestWord (String str) {
        int lengthLongestWords = 0;
        boolean hasLongestWord = false;
        String[] words = str.split(" ");
        StringBuilder longestWord = new StringBuilder(words[0]);
        for (String word: words) {
            while (word.length() > longestWord.length()) {
                longestWord = new StringBuilder(word);
                hasLongestWord = true;
                lengthLongestWords=longestWord.length();
            }
        }if (!hasLongestWord){
            return "There is no longest word.";
        }
        System.out.println("The length of longest word is : " + lengthLongestWords);
        return longestWord.toString();
    }
}
