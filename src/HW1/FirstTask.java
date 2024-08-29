package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class FirstTask {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.print(" Hello! What is your name? ");
            String name = reader.readLine();
            System.out.println(" Hello! " + name);

            System.out.println(" Where do you live, " + name + "?");
            String adress = reader.readLine();
            System.out.print(" Hello, " + name + "." + " You are live on the " + adress);

        }
}
