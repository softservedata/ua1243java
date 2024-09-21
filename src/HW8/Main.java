package HW8;

class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        FullName fullName1 = new FullName("Anastasiia", "Datsko");
        FullName fullName2 = new FullName("Marta", "Tatsyn");

        Student student1 = new Student(fullName1, 20, 2);
        Student student2 = new Student(fullName2, 21, 3);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        try {
            Student clonedStudent = (Student) student1.clone();
            clonedStudent.setCourse(4);

            System.out.println(clonedStudent.info());
            System.out.println(clonedStudent.activity());
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}
