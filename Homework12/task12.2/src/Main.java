import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        ArrayList<Double> listNumbers = new ArrayList<>(10);
        var scan = new Scanner(System.in);
        while (true) {
            try {
            System.out.println("Enter the 10 numbers!");
            for (int i = 0; i < 10; i++) {
                listNumbers.add(Double.valueOf(scan.nextLine()));
            }
            readNumber(listNumbers);
            break;
            }catch (NumberFormatException ex){
                System.out.println("It should be a number!");
            }
        }
    }
    public static void readNumber(ArrayList<Double> listNumbers)  {
        int start = 0;
        int end = 10;
        for (int i = 0; i < 10; i++) {
            if (listNumbers.get(i) <=end && listNumbers.get(i)>=start ) {
                System.out.println("This number " +listNumbers.get(i)+" contains in range between " + "["+ start + "," + end+"]" );
            }
        }
    }
}

