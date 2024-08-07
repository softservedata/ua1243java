package homework_Assignments_Dmytro_Livantsov.homeW_2_package;

import java.util.Scanner;

public class HW_SmallestNumber_Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        int numberThree;

        System.out.println("Input first number");
        numberOne = scanner.nextInt();
        System.out.println("Input second number");
        numberTwo = scanner.nextInt();
        System.out.println("Input third number");
        numberThree = scanner.nextInt();

        System.out.println("The smallest number is " +
                getSmallestNumber(numberOne, numberTwo, numberThree));
    }

    public static int getSmallestNumber(int firstNumber, int secondNumber, int thirdNumber){
            if (firstNumber <= secondNumber && firstNumber <= thirdNumber){
            return firstNumber;
        } else if (secondNumber <= thirdNumber){
            return secondNumber;
        } else {
           return thirdNumber;
        }
    }
}
