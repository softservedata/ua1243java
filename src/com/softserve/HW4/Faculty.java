package com.softserve.HW4;

import java.util.Scanner;

class Faculty {
    private int numberOfStudents;
    private CurrentSeason currentSeason;

    // Конструктор класу Faculty
    Faculty(int numberOfStudents, CurrentSeason currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    enum CurrentSeason {
        WINTER("Winter Exams Period"),
        SPRING("Second Semester"),
        SUMMER("Vacation Period"),
        AUTUMN("First Semester");

        private final String seasonName;

        CurrentSeason(String seasonName) {
            this.seasonName = seasonName;
        }

        public String getSeasonName() {
            return seasonName;
        }
    }

    public String getSeasonPeriod() {
        return currentSeason.getSeasonName();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of students:");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter the current season (Winter, Spring, Summer, Autumn):");
        String inputSeason = scanner.nextLine().trim();

        CurrentSeason season = CurrentSeason.valueOf(inputSeason.toUpperCase());

        Faculty faculty = new Faculty(numberOfStudents, season);

        System.out.println("Number of students: " + faculty.numberOfStudents);
        System.out.println("Current season: " + season.name());
        System.out.println("This season corresponds to: " + faculty.getSeasonPeriod());

        scanner.close();
    }
}
