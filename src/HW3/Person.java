package HW3;

import java.util.Scanner;
import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    //default constructor
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }

    //constructor with two parameters
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    //method to calculate age
    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }

    //method to input information about the person
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }

    //method to output information about the person
    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    //method to change the name
    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public static void main(String[] args) {
        Person[] persons = new Person[5];

        System.out.println("Enter information for person " + 1 + ":");
        persons[1] = new Person();
        persons[1].input();

        System.out.println("Enter information for person " + 2 + ":");
        persons[2] = new Person();
        persons[2].input();

        System.out.println("Enter information for person " + 3 + ":");
        persons[3] = new Person();
        persons[3].input();

        System.out.println("Enter information for person " + 4 + ":");
        persons[4] = new Person();
        persons[4].input();

        System.out.println("Enter information for person " + 5 + ":");
        persons[5] = new Person();
        persons[5].input();

        System.out.println("\nInformation for person " + 1 + ":");
        persons[1].output();

        System.out.println("\nInformation for person " + 2 + ":");
        persons[2].output();

        System.out.println("\nInformation for person " + 3 + ":");
        persons[3].output();

        System.out.println("\nInformation for person " + 4 + ":");
        persons[4].output();

        System.out.println("\nInformation for person " + 5 + ":");
        persons[5].output();
    }
}
