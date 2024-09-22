class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info() {
        return "Name: " + name + ", Age: " + age;
    }

    public String activity() {
        return "I am a person.";
    }
}

class Student extends Person {
    private int course;

    public Student(String name, int age, int course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university.";
    }

    public Student(Student other) {
        super(other.name, other.age);
        this.course = other.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

public class hw2_lesson8 {
    public static void main(String[] args) {
        Student student1 = new Student("Dime", 20, 2);
        Student student2 = new Student("Oleg", 21, 3);

        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = new Student(student1);
        student3.setCourse(4);

        System.out.println("Cloned Student: " + student3.info());
        System.out.println(student3.activity());
    }
}
