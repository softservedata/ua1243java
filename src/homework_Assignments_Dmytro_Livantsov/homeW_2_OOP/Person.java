package homework_Assignments_Dmytro_Livantsov.homeW_2_OOP;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){}

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Input last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Input birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public void outPut(){
        System.out.println("First name is " + firstName + "\n" +
                "Last name is " + lastName + "\n" +
                this.firstName + " was born in " + birthYear);
    }

    public void changeName(String fN, String lN){
        this.firstName = fN;
        this.lastName = lN;
    }

    public void getAge(){
        LocalDate currentDate = LocalDate.now();

        int yearOfBirth = this.birthYear;
        int ageOfPerson = currentDate.getYear() - yearOfBirth;
        System.out.println(this.firstName + " is " + ageOfPerson + " years old");
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
