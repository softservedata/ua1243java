package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please, enter the sentences:");
        String sentences = scan.nextLine();
        scan.close();
        var str = new StringOperations();
        System.out.println("Thank you!");
        System.out.println("The longest word in you sentences is:" + str.findLongestWord(sentences));
        System.out.println("The second word in reverse order:" + str.reverseOrder(sentences));
    }
}