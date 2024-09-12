package homework.dmytro.livantsov.homeW_08_Nested_Inner_Classes_Task2;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("Dmitry", 13245);
        Student student1 = new Student("Alex", 13255);


        System.out.println(student.info());
        System.out.println(student.activity());

        System.out.println(student1.info());
        System.out.println(student1.activity());

        Student student2;
        try {
            student2 = (Student) student.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


        student2.setCourseNumber(11111);
        System.out.println("\nFull copy of student Dmitry with another course - " + student2);

        System.out.println("Original student - " + student);
        System.out.println("Original student - " + student1);


    }
}
