package homework.dmytro.livantsov.homeW_1.correct;

import java.util.Scanner;

public class UserDialog {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("What is your address?");
        String address = scanner.next();

        System.out.println("Your name is " + name + "\nYour address is " + address);
    }
}
