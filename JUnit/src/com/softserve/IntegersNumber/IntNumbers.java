package com.softserve.IntegersNumber;

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

        System.out.println("The sum of the first five positive elements "+getSum(arr));
        System.out.println("The product of the last five negative elements "+getProduct(arr));
    }
    public static int getSum (int[] arr){


        int sum=0;
        for (int i = 0; i < 5; i++){
            if (arr[i]>0){
                sum+=arr[i];

            }
        }
        return sum;
    }
    public static int getProduct(int[] arr){
        int product=1;

        for (int i = 5; i <10; i++){
            if (arr[i]<0){
                product = product*arr[i];

            }
            else if (arr[5]>0 && arr[6]>0 && arr[7]>0 && arr[8]>0&& arr[9]>0 ){
                return 0;
            }
        }
        return product;
    }

}
