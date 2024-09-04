import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern1 = "^\\$[0-9]{1,3}((\\.[0-9]{3})|)+((\\.[0-9]{2})|)";
        String pattern2 = "[A-z]+ \\$[0-9]{1,3}((\\.[0-9]{3})|)+((\\.[0-9]{2})|)";
        System.out.println("Hello! Please, enter the price $  :");
        String data = scan.nextLine();
        Pattern p1=Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(data);
        if(m1.matches()){
            System.out.println("Ok");

        }else {
            System.out.println("Not ok!");
        }
        System.out.println("Thank you!");
        m1.reset();
        System.out.println("Hello! Please, enter the  information about product and price in US currency format  :");
        String text = scan.nextLine();
        scan.close();
        Pattern p2=Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(text);
        if(m2.matches()){
            System.out.println("Ok");

        }else {
            System.out.println("Not ok!");
        }
        System.out.println("Thank you!");
        m2.reset();

    }
    }
