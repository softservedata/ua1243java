package homework.dmytro.livantsov.homeW_05_Array_Loops_Tasks_2_3_4_5;

import java.util.Scanner;

public class Cycle_Sum {


    public static void isCycleContinue(){

        boolean isPerformOperation = true;
        String shouldWeContinue = "no";

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int firstNum;
        int secondNum;
        int sum = 0;


        do {
            System.out.println("Type two numbers :");
            firstNum = scanner.nextInt();
            secondNum = scanner.nextInt();

            sum = firstNum + secondNum;
            System.out.println("Sum is " + sum);

            System.out.println("\nWould you like continue the cycle?\n - Type 'Yes' or 'No'");
            shouldWeContinue = scanner1.nextLine();

            if (shouldWeContinue.equalsIgnoreCase("No")) {
                isPerformOperation = false;
            }

        }while (isPerformOperation);

    }
}
