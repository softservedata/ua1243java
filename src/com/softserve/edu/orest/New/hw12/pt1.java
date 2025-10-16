package com.softserve.edu.orest.New.hw12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String fragment = scanner.nextLine();
        System.out.println("Enter second String: ");
        String text = scanner.nextLine();

//        System.out.println(text.contains(fragment));

//        System.out.println(text.matches(".*" + fragment + ".*"));

        String quated = Pattern.quote(fragment);
        System.out.println(text.matches(".*" + quated + ".*"));
    }
}
