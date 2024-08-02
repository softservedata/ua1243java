import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person();
        people[0].input("John", "Doe", "15.04.1990");

        people[1] = new Person();
        people[1].input("Mary", "Smith", "23.07.1985");

        people[2] = new Person();
        people[2].input("Alex", "Johnson", "02.12.1992");

        people[3] = new Person();
        people[3].input("Natalie", "Brown", "11.11.1988");

        people[4] = new Person();
        people[4].input("Yuri", "Miller", "20.02.2000");
        people[4].changeName("Nikita","Mantsov");

        System.out.println("\nInformation about persons:");
        for (Person person : people) {
            person.output();
            System.out.println();
        }
    }
}

