package homework.dmytro.livantsov.homeW_08_Nested_Inner_Classes_Task1;

public class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
