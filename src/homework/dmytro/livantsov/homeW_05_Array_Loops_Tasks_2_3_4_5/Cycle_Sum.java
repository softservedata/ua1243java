package homework.dmytro.livantsov.homeW_05_Array_Loops_Tasks_2_3_4_5;

import java.util.Scanner;

public class Cycle_Sum {//Class names should follow the CamelCase convention,
    // so any new name should adhere to this standard.
//InteractiveSumCalculator

    public static void isCycleContinue() {

        boolean isPerformOperation = true;
        String shouldWeContinue = "no";

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        //There's no need to use two Scanner objects.
        // You can manage both operations with a single scanner,
        // and ensure that you close it with scanner.close() after the loop to prevent resource leaks.
        int firstNum;
        int secondNum;
        int sum = 0;//The sum variable doesn’t need to be initialized
        // with 0 since it's immediately assigned a value in the loop.
        // You can declare it without the initial value.


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

        } while (isPerformOperation);

    }
}
