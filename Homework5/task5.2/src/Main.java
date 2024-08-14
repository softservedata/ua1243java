import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Scanner SCANNER=new Scanner(System.in);
    public static void main(String[] args) {
        run();


    }
    public static void run(){
         String decision="";
        int count = 0;
        do{
            System.out.println("Please enter two numbers:");
            double number1=SCANNER.nextDouble();
            double number2=SCANNER.nextDouble();
            double sum=number1+number2;
            System.out.println("The sum is: "+sum);
            System.out.println("do you wont continue?");

            decision = SCANNER.nextLine();
            SCANNER.nextLine();


            if(decision.equals("Yes")) {
                run();
            } else {
                System.out.println("Finished");
            }



        }while (decision.equals("Yes"));

        SCANNER.close();

    }
}