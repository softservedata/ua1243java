package com.softserve.edu.orest.New.hw12;

import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the last name ");
        String lastName = scanner.nextLine();
        System.out.println("Input the first name ");
        String firstName = scanner.nextLine();
        System.out.println("Input the middle name ");
        String middleName = scanner.nextLine();

        System.out.printf("%s %C. %C.%n",lastName, firstName.charAt(0), middleName.charAt(0));
        System.out.println(firstName);
        System.out.printf("%s %s %s", firstName, middleName, lastName);

    }
}
