package HomeWork1Intro;

import java.util.Scanner;
/*Define two String variables name and address. Output question "What is your name?" to the console.
 Read the value of name and output next question: “Where do you live, (name)?“ to the console.
 Read the value of address from the console and output the complete information.*/

public class Name_Address2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String address;

        System.out.print("What is your name? ");
        name = scanner.nextLine();

        System.out.print("Where do you live, " + name + "? ");
        address = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        scanner.close();
    }

}
