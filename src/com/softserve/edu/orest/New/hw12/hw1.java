package com.softserve.edu.orest.New.hw12;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Input a sentence of five words: ");
        String sentence = scanner.nextLine();

        String longest = longestWord(sentence);
        System.out.println("The longest word is: " + longest);

        int n = numberOfLetters(longest);
        System.out.println("Which has " + n + " letters");

        String reversed = reversedSecond(sentence);
        System.out.println(reversed);
    }

    private static String reversedSecond(String sentence) {
        var words = sentence.split(" ");
        String secondWord = words[1];
        String reversed = new StringBuilder(secondWord).reverse().toString();
        return reversed;
    }

    private static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (var word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    private static int numberOfLetters(String longest) {
        int n = longest.length();
        return n;
    }
}
