import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        int n;
        System.out.println("Enter the number of calls!");
        n=scan.nextInt();
        float[] costArray = new float[n];
        System.out.println("Enter the cost per minute for each calls: ");

        for (int i = 0; i < n; i++) {
            costArray[i]=scan.nextFloat();//reading array elements from the user
        }

        float[] durationArray= new float[n];
        System.out.println("Thank you! Now, please enter the duration: ");
        for(int i=0;i<n;i++){
          durationArray[i]= scan.nextFloat();
        }

        float[] arrayMultiply = new float[costArray.length];
            for (int index = 0; index < costArray.length; index++) {
                arrayMultiply[index] = costArray[index] * durationArray[index];
                System.out.println(arrayMultiply[index]+ " ");
            }

           float sum = 0;
            for(int index = 0; index<arrayMultiply.length;index++) {
                sum=sum+arrayMultiply[index];
            }
        System.out.println("Total cost of calls:" + sum);
scan.close();
        }




    }
