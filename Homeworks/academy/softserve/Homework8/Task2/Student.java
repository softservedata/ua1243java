package academy.softserve.Homework8.Task2;

public class Student extends Person {
    private int course;

    public Student(String firstName, String lastName, int course) {
        super(firstName, lastName);
        this.course = course;
    }

    public Student(Student student1) {
        super(student1.getFirstName(), student1.getLastName());
        this.copy(student1);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    String activity() {
        return "I'm studying...";
    }

    @Override
    public void info() {
        System.out.println("First name: " + getFirstName() +
                ", Last name: " + getLastName() + ", Course: " +
                getCourse() + '\n' + activity() + '\n');
    }

    private void copy(Student x) {
        this.setCourse(x.getCourse());
        this.setFirstName(x.getFirstName());
        this.setLastName(x.getLastName());
    }


    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                '}' + super.toString();
    }
}