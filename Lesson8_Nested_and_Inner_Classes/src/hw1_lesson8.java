class FullName {
    private String firstName;
    private String lastName;

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d",
                fullName.getFirstName(),
                fullName.getLastName(),
                age);
    }

    public abstract String activity();
}

class Teacher extends Person {
    public Teacher(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        return "Teaching students";
    }
}

class Student extends Person {
    public Student(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        return "Studying";
    }
}

public class hw1_lesson8 {
    public static void main(String[] args) {
        FullName teacherName = new FullName("John", "Doe");
        FullName studentName = new FullName("Jane", "Smith");

        Person teacher = new Teacher(teacherName, 45);
        Person student = new Student(studentName, 20);

        System.out.println(teacher.info());
        System.out.println("Activity: " + teacher.activity());

        System.out.println(student.info());
        System.out.println("Activity: " + student.activity());
    }
}
