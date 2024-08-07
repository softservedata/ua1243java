package homework_Assignments_Dmytro_Livantsov.homeW_1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Homework_1 {
    static void assignment(){

        // FIRST TASK
        double pi = 3.14159;

        Scanner scanner = new Scanner(in);
        out.print("Write radius - ");
        int radius = scanner.nextInt();
        double perimetr =2*pi*radius;
        out.println(perimetr);
        //


        /// SECOND TASK
        out.println("What is your name?");
        String name = scanner.next();

        out.println("What is your address?");
        String address = scanner.next();

        out.println("Your name is " + name + "\nYour address is " + address);
        out.println("");
        //


        //// THIRD TASK
        Scanner scannerCountryAndTime = new Scanner(in);
        String originCountry;
        int destinationCountry;

        double communicationTime;
        double pricePerMinuteGermany = 0.2;
        double pricePerMinuteFrance = 0.4;
        double pricePerMinuteEngland = 0.6;
        double phoneBill;

        out.print("You want to make call from - ");
        originCountry = scannerCountryAndTime.nextLine();

        out.println("Write the country direction where you want to call (Germany = 1, France = 2, England = 3, Call to all countries = 4)");
        destinationCountry = scannerCountryAndTime.nextInt();

        out.print("Write the time in minutes, how long you want to be connected - ");
        communicationTime = scannerCountryAndTime.nextDouble();

        /*
         * The price is in Euros.
         */

        switch (destinationCountry) {
            case 1 -> {
                // the cost per minute 0.2 cents (Germany)
                phoneBill = communicationTime * pricePerMinuteGermany;
                out.println("You called from - "+originCountry + " to Germany.");
                out.println("The cost of communication is " + phoneBill);
            }
            case 2 -> {
                // the cost per minute 0.4 cents (France)
                phoneBill = communicationTime * pricePerMinuteFrance;
                out.println("You called from - "+originCountry + " to France.");
                out.println("The cost of communication is " + phoneBill);
            }
            case 3 -> {
                // the cost per minute 0.6 cents (England)
                phoneBill = communicationTime * pricePerMinuteEngland;
                out.println("You called from - "+originCountry + " to England.");
                out.println("The cost of communication is " + phoneBill);
            }
            case 4 -> {
                // All countries
                double costOfGermanyCall = pricePerMinuteGermany * communicationTime;
                double costOfFranceCall = pricePerMinuteFrance * communicationTime;
                double costOfEnglandCall = pricePerMinuteEngland * communicationTime;
                phoneBill = costOfEnglandCall + costOfFranceCall + costOfGermanyCall;

                out.println("You called from - "+originCountry + " to all countries.");
                out.println("The cost of communication with Germany is " + costOfGermanyCall);
                out.println("The cost of communication with France is " + costOfFranceCall);
                out.println("The cost of communication with England is " + costOfEnglandCall);
                out.println("The total cost of communication is " + phoneBill);
            }
            default -> {
                String unavailableCountry = "This country is not available for communication";
                out.println(unavailableCountry);
            }
        }
        //
    }
}
