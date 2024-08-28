package task4;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//мінімально виправила, до того було некоректно використано значення кількісті студентів
        System.out.println("Please enter the number of students: ");
        int numbersOfStudents = SCANNER.nextInt();
        System.out.println("Count of students: " + numbersOfStudents);
        System.out.println("Please enter the number of currentSeason from 1 to 4: ");
        task4.CurrentSeason currentSeason = task4.CurrentSeason.getByNumber(SCANNER.nextInt());
        System.out.println("This number corresponds to: " + currentSeason.englishName);
        System.out.println("Це число відповідає: " + currentSeason.ukrainianName);
    }
}

