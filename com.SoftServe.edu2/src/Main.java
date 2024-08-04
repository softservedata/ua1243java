import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Scanner scan = new Scanner(System.in);
    int firstNumber = scan.nextInt();
    int secondNumber = scan.nextInt();
    int thirdNumber = scan.nextInt();


    public  void finderSmallestNumber(){
        int  result =  Math.min(Math.min(firstNumber,secondNumber),thirdNumber) ;
        System.out.println("The smallest number is: "+result);
    }

    public static void main(String[] args) {
        System.out.println("Hello! Please, enter three numbers: ");
Main obj = new Main();
obj.finderSmallestNumber();


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}