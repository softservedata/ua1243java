import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Hello! What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.print("Where do you live?");
        String address = scan.nextLine();
        System.out.println("Thank you for information!");
        System.out.println("Name: "+name);
        System.out.print("Address: "+address);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



    }
}