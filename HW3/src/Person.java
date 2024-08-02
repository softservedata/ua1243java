import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Person {
    private String firstName;
    private String lastName;
    private String DateOfBirth;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.DateOfBirth = "";
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private LocalDate parseDate(String dateStr) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(dateStr, formatter);
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate;
        try{
            birthDate = parseDate(DateOfBirth);
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format");
            return -1;
        }
        if (birthDate.isAfter(currentDate)) {
            throw new IllegalArgumentException("Date of birth cannot be in the future.");
        }
        return Period.between(birthDate, currentDate).getYears();
    }

    public void input(String firstName, String lastName, String DateOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.DateOfBirth = DateOfBirth;
    }

    public void output() {
        System.out.println("Name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Date of birth: " + this.DateOfBirth);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(String birthYear) {
        this.DateOfBirth = birthYear;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }
}
