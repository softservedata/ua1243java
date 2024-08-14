package academy.softserve.Homework1;

import java.util.Scanner;

public class Homework_Task2 {
    public static void main(String[] args) {
/*
      Define two String variables name and address.
      Output question "What is your name? to the console.
      Read the value of name and output next question: “Where do you live, (name)?“ to the console.
      Read the value of address from the console and output the complete information.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Where do you live "+name+"? (city)");
        String address = scan.nextLine();
        System.out.println(name + " lives in "+ address+".");

    }
}
