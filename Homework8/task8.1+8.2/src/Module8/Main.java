package Module8;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student student1 = new Student(new Person.FullName("Khrystyna", "Tsvyk"),18,3,"Math, Java , OOP");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        Student student2 = new Student(new Person.FullName("Oleksandr", "Martynov"),19,3,"C++, Java , OOP");
        System.out.println(student2.info());
        System.out.println(student2.activity());
        System.out.println("=========================");


        Student student3 = (Student) student1.clone();
        student3.setCourseList("Python, C#, Topology");
        System.out.println("Modified student1: ");
        System.out.println(student3.info());
        System.out.println(student3.activity());

        System.out.println("Original student1: ");
        System.out.println(student1.info());
        System.out.println(student1.activity());

    }
}