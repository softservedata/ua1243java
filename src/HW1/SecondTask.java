package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


    public class SecondTask{
        public static void main(String[] args ) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Hi, please write the radius");
            int radius = Integer.parseInt(reader.readLine());
            double perimetr = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Perimetr is " + perimetr);
            System.out.println("Area is " + area);

        }
    }
