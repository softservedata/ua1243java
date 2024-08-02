package com.softserve.edu.orest.hw1;

import java.util.Scanner;

//Output question “How are you?“. Define string variable answer. Read the value
//answer and output: “You are (answer)"

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("How are you?");

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();

        System.out.println("You are " + a);

    }

}

