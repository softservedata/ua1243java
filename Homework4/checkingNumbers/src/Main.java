import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[3];
        System.out.println("Please, enter the numbers: ");
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
            double remainder=array[i] % 2;
            if ( remainder ==0) {
                System.out.println("This number is even");
            }
            else{
                System.out.println("This number is odd");
            }
        }





    }
}