package persons;

import java.time.Year;

import static persons.Main.SCANNER;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this("N/A", "N/A");
    }

    public Person(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(int birthYear) {
        return Year.now().getValue() - birthYear;// better than use 2024
    }


    public void changeName(String fn, String ln) {//оскільки ти будеш використовувати цей метод на об'єкті, не
        //треба робити його статичним, можна, але не рекомендована практика.

        System.out.println("Should the  name be changed?");
        String answer = SCANNER.nextLine();
        String yes = "Yes";
        String no = "No";
        if (answer.equalsIgnoreCase(yes)) {
            setFirstName(fn);
            setLastName(ln);
            //Не знаю як тут далі перезаписати дані
        } else if (answer.equalsIgnoreCase(no)) {
            System.out.println("ok,thank you.");
        } else {
            System.out.println("Please enter yes or no.");
        }

    }

    public void input() {//те саме зі static
        System.out.println("Input first name: ");
        String firstName = SCANNER.nextLine();
        setFirstName(firstName);
        System.out.println("Input last name: ");
        String lastName = SCANNER.nextLine();
        setLastName(lastName);
        System.out.println("Input the birth of year: ");
        int birthYear = SCANNER.nextInt();
        SCANNER.nextLine();
        setBirthYear(birthYear);

    }

    public void output() {// так само прибрала static
        System.out.println("Name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Date of birth: " + getBirthYear());
        System.out.println("Age: " + getAge(getBirthYear()));
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
