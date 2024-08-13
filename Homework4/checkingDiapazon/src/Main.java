import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float[] array = new float[3];
        System.out.println("Please, enter the numbers: ");
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextFloat();

            if ( array[i]>-5 && array[i]<5) {
                System.out.println("This number belong to the range [-5;5] ");
            }
            else{
                System.out.println(" Please note that the range includes the values -5 and 5");
            }
        }





    }
}