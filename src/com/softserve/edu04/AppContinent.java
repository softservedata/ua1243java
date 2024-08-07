package com.softserve.edu04;

enum Continent {
    EURASIA("Eurasia"),
    NOTH_AMERICA("Noth America"),
    SOUTH_AMERICA("South America"),
    AFRICA("Africa"),
    AUSTRALIA("Australia"),
    ANTARCTIDA("Antarctida");

    private String name;

    Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Continent {" +
                "name='" + name + '\'' +
                '}';
    }
}


public class AppContinent {
    public static void main(String[] args) {

        for (Continent current : Continent.values()) {
            System.out.println("Continent name = " + current); // toString()
        }
        //
        String country = "Ukraine";
        Continent continent = switch (country) {
            case "Ukraine", "Poland", "France", "China" -> Continent.EURASIA;
            case "Egypt", "Marocco", "Algeria" -> Continent.AFRICA;
            case "Australia" -> Continent.AUSTRALIA;
            case "USA", "Canada" -> Continent.NOTH_AMERICA;
            case "Argentina", "Brasil" -> Continent.SOUTH_AMERICA;
            default -> Continent.EURASIA;
        };
        //System.out.println("continent = " + continent.name());
        System.out.println("continent = " + continent.getName());
    }
}
