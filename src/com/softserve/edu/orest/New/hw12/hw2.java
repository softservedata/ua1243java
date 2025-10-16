package com.softserve.edu.orest.New.hw12;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Іnput a sentence that contains words separated by more than one space");
        String sentence = scanner.nextLine();

        String sentenceFixed = sentence.replaceAll("\\s+", " ");
        System.out.println(sentenceFixed);

    }
}
