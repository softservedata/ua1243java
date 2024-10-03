package academy.softserve.Homework8.Task1;

public class FullName {
    private String firstName, lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract class Person {
        int age;
        FullName fullName;

        public abstract String activity();

        public Person(int age, FullName fullName) {
            this.age = age;
            this.fullName = fullName;
        }

        public String info() {
            return "First name: " + fullName.getFirstName() +
                    ", Last name: " + fullName.getLastName() +
                    ", Age: " + age;
        }

        public int getAge() {
            return age;
        }

        public FullName getFullName() {
            return fullName;
        }

        @Override
        public String toString() {
            return info();
        }
    }
}
