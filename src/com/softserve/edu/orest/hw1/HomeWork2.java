package com.softserve.edu.orest.hw1;

//Define two String variables name and address. Output question "What is your name?
//to the console. Read the value of name and output next question: “Where do you live,
//(name)?“ to the console. Read the value of address from the console and output the
//complete information.

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Where do you live, " + name);

        String address = scanner.next();

        System.out.println(name + " lives in " + address);

    }
}
