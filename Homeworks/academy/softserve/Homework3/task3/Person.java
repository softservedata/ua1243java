package academy.softserve.Homework3.task3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Person {
    Scanner scan = new Scanner(System.in);
    public String firstName, lastName;
    private LocalDate today;
    private LocalDate birthDate;


    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.today = LocalDate.now();
    }

    public Person() {
        LocalDate.now();
    }

    public int getAge(LocalDate today, LocalDate birthDate) {
        if (today != null && birthDate != null) {
            return Period.between(today, birthDate).getYears();
        } else {
            return 0;
        }
    }

    public void setBirthDate(int year, int month, int day) {
        this.birthDate = LocalDate.of(year, month, day);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = LocalDate.now();
    }

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

    @Override
    public String toString() {
        return "First name " + firstName +
                "\nLast name " + lastName +
                "\nborn on " + birthDate +
                "\n" + getAge(birthDate, today) + " years old";
    }
}

