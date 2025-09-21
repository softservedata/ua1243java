package com.softserve.edu.orest.New.hw4;


import java.util.Scanner;

enum ListOfContinents {
    EUROPA("Eurasia"), ASIA("Asia"), AFRICA("Africa"), NORTH_AMERICA("North America"), SOUTH_AMERICA("South America"), ANTARCTICA("Antarctica"), AUSTRALIA("Australia");

    private String name;

    ListOfContinents(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Continents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the country: ");
        String countryName = scanner.nextLine();

        ListOfContinents listOfContinents = switch (countryName.toLowerCase()) {
            case "ukraine", "france", "germany" -> ListOfContinents.EUROPA;
            case "china", "japan", "cambodia" -> ListOfContinents.ASIA;
            case "algeria", "niger", "angola" -> ListOfContinents.AFRICA;
            case "usa", "canada", "mexico" -> ListOfContinents.NORTH_AMERICA;
            case "brazil", "bolivia", "peru" -> ListOfContinents.SOUTH_AMERICA;
            case "antarctica" -> ListOfContinents.ANTARCTICA;
            case "australia" -> ListOfContinents.AUSTRALIA;
            default -> throw new IllegalArgumentException("Not a country" + countryName);
        };

        System.out.println(countryName + " belongs to the " + listOfContinents);
    }
}
