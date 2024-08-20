package IntegersNumber;

import java.util.Scanner;

public class IntNumbers {
    public static final Scanner SCANNER=new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter the 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = SCANNER.nextInt();
            //reading array elements from the user
            }


        int sum1=0;
        for (int i = 0; i < 5; i++){
            if (arr[i]>0){
                sum1+=arr[i];

            }
        }
        System.out.println("The sum of the first five positive elements "+sum1);
        int product=1;
        for (int i = 5; i <10; i++){
            if (arr[i]<0){
                product = product*arr[i];
            }
        }
        System.out.println("The product of the last five negative elements "+product);
    }
}
