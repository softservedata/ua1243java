import java.util.Scanner;

import static java.lang.System.in;

public class pr3_lesson4 {
    enum Continent {
        AFRICA, ASIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, OCEANIA, ANTARCTICA
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.print("Enter the name of the country: ");
        String country = scan.nextLine().trim().toLowerCase();

        Continent continent;

        switch (country) {
            case "nigeria":
            case "kenya":
            case "egypt":
            case "south africa":
                continent = Continent.AFRICA;
                break;

            case "china":
            case "india":
            case "japan":
            case "saudi arabia":
                continent = Continent.ASIA;
                break;

            case "france":
            case "germany":
            case "italy":
            case "spain":
                continent = Continent.EUROPE;
                break;

            case "usa":
            case "canada":
            case "mexico":
                continent = Continent.NORTH_AMERICA;
                break;

            case "brazil":
            case "argentina":
            case "chile":
                continent = Continent.SOUTH_AMERICA;
                break;

            case "australia":
            case "new zealand":
                continent = Continent.OCEANIA;
                break;

            case "none":
                continent = Continent.ANTARCTICA;
                break;

            default:
                System.out.println("Unknown country or continent.");
                return;
        }

        System.out.println("The continent for " + country.substring(0, 1).toUpperCase() + country.substring(1) + " is " + continent + ".");
    }
}
