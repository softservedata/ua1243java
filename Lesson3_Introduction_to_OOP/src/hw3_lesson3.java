import java.util.Scanner;
import java.time.Year;
import java.util.Scanner;
import java.time.Year;

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

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

    // Default constructor
    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.birthYear = 0;
    }

    // Constructor with 2 parameters (first and last names)
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 0;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}


public class hw3_lesson3 {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            System.out.println("Enter details for person " + (i + 1) + ":");
            people[i].input();
            System.out.println();
        }

        System.out.println("Information about all persons:");
        for (Person person : people) {
            person.output();
            System.out.println();
        }
    }
}
