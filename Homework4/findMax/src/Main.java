import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the three numbers: ");



        //напишите тут ваш код
        int[] array = new int[3];
        int maximum = array[0];
        int minimum  = array[0];


        for(int i = 0; i < 3; i++){

            array[i] = Integer.parseInt(scan.nextLine());
            if ( array[i] > maximum){
                maximum = array[i];
            }
            else if (array[i] < minimum){
                minimum = array[i];
            }
        }
        System.out.println("Max value is " + maximum);
        System.out.println("Min value is " + minimum);



       }

        /*
        if (a > b && b > c) {
            System.out.println("Max value  is: " +a);
            System.out.println("Min value  is: " +c);
        } else if (a > b &&  b<c) {
            System.out.println("Max value  is: " +a);
            System.out.println("Min value  is: " +b);

        } else if (b > c && c>a) {
            System.out.println("Max value  is: "+ b);
            System.out.println("Min value  is: " +a);

        }else if (b > c && c<a) {
            System.out.println("Max value  is: "+ b);
            System.out.println("Min value  is: " +c);

        }
        else if(c>b && b>a) {
            System.out.println("Max value  is: "+ c);
            System.out.println("Min value is: " + a);


        }
        else if (a<c  && b<c )  {
            System.out.println("Max value  is: "+ c);
            System.out.println("Min value is: " + b);
        }

*/

    }
