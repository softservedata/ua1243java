package com.softserve.edu.orest.New.hw1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Where do you live, " + name);
        String address = scanner1.next();

        System.out.println("Name:" + name + ", Address: " + address);
    }
}
