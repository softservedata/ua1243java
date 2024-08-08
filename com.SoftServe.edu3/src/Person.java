package persons;

import static persons.Main.SCANNER;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this("N/A","N/A"  );
}

    public Person(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    static int getAge(int birthYear){

        return 2024-birthYear;
    }


    public  static void changeName(String fn, String ln ){

        System.out.println("Should the  name be changed? ");
        String answer = SCANNER.nextLine();
        String yes = "Yes";
        String no = "No";
        if (answer.equalsIgnoreCase(yes)) {
            fn = SCANNER.nextLine();
            //Не знаю як тут далі перезаписати дані
        }
        else if (answer.equalsIgnoreCase(no)) {
            System.out.println("ok,thank you.");
        }
        else {
            System.out.println("Please enter yes or no.");
        }

    }
    public static void input (Person person) {
        System.out.println("Input first name: ");
        String firstName = SCANNER.nextLine();
        person.setFirstName(firstName);
        System.out.println("Input last name: ");
        String lastName = SCANNER.nextLine();
        person.setLastName(lastName);
        System.out.println("Input the birth of year: ");
        int birthYear = SCANNER.nextInt();
        SCANNER.nextLine();

        person.setBirthYear(birthYear);

    }
    static public void output(Person person) {
        System.out.println("Name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Date of birth: " + person.getBirthYear());
        System.out.println("Age: " + getAge(person.getBirthYear()));
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
