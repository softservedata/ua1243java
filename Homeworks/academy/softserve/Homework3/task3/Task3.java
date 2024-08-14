package academy.softserve.Homework3.task3;

import java.time.LocalDate;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("People: ");
        Person[] persons = {
                new Person("Andrew", "Zak", LocalDate.of(2005, 12, 11)),
                new Person("Dan", "Ricardo", LocalDate.of(2005, 12, 11)),
                new Person("Michael", "Schumacher", LocalDate.of(2005, 12, 11)),
                new Person("Lewis", "Hamilton", LocalDate.of(2005, 12, 11)),
                new Person("Charles", "Leclerc", LocalDate.of(2005, 12, 11))
        };
        for (int i = 0; i < persons.length; i++) {
            System.out.println("\n" + (i + 1) + ". " + "First name " + persons[i].getFirstName() + "\nLast name " + persons[i].getLastName());
        }
        System.out.printf("Choose the person by number (1-5) ");
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        if (choose < 0 || choose > 5) {
            System.out.println("Invalid number, Please choose number from 1 to 5");
            return;
        }
        Person selectedPerson = persons[choose - 1];
        System.out.println("\n1. See information\n2.Change name");
        int action = scan.nextInt();
        scan.nextLine();
        switch (action) {
            case 1:
                System.out.println("Person information " + selectedPerson);
                break;
            case 2:
                System.out.println("What's new name?");
                String newName = scan.nextLine();
                selectedPerson.setFirstName(newName);
                System.out.println("What's new last name?");
                String newLastName = scan.nextLine();
                selectedPerson.setLastName(newLastName);
                System.out.println("\nYour new information\n" + selectedPerson.toString());

        }
    }
}
