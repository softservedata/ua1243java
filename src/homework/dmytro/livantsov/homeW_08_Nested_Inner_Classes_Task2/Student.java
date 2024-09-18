package homework.dmytro.livantsov.homeW_08_Nested_Inner_Classes_Task2;

import homework.dmytro.livantsov.homeW_08_Nested_Inner_Classes_Task1.APerson;

public class Student extends APerson implements Cloneable{
    private int courseNumber;
    private String studentName;

    public Student(String studentName, int courseNumber) {
        super();
        this.courseNumber = courseNumber;
        this.studentName = studentName;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String activity() {
        return "I study at SoftServe Academy!";
    }


    @Override
    public String info() {
        return "Java programming courses are designed to teach the fundamentals of Java," +
                " a popular, high-level programming language known for its versatility," +
                " performance, and wide range of applications. ";
    }

    @Override
    public String toString() {
        return "Student{" +
                "courseNumber=" + courseNumber +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        return cloned;
    }
}
