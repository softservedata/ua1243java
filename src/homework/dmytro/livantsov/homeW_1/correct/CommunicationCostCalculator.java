package homework.dmytro.livantsov.homeW_1.correct;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CommunicationCostCalculator {
    static Scanner scannerCountryAndTime = new Scanner(in);

    public static void main(String[] args) {

        String originCountry;
        String message1 = "You called from - ";
        String message2 = "The cost of communication is ";
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
                out.println(message1 + originCountry + " to Germany.");
                out.println(message2 + phoneBill);
            }
            case 2 -> {
                // the cost per minute 0.4 cents (France)
                phoneBill = communicationTime * pricePerMinuteFrance;
                out.println(message1 + originCountry + " to France.");
                out.println(message2 + phoneBill);
            }
            case 3 -> {
                // the cost per minute 0.6 cents (England)
                phoneBill = communicationTime * pricePerMinuteEngland;
                out.println(message1 + originCountry + " to England.");
                out.println(message2 + phoneBill);
            }
            case 4 -> {
                // All countries
                double costOfGermanyCall = pricePerMinuteGermany * communicationTime;
                double costOfFranceCall = pricePerMinuteFrance * communicationTime;
                double costOfEnglandCall = pricePerMinuteEngland * communicationTime;
                phoneBill = costOfEnglandCall + costOfFranceCall + costOfGermanyCall;

                out.println(message1 + originCountry + " to all countries.");
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
    }
}