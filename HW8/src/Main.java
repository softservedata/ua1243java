public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        FullName name1 = new FullName("John", "Doe");
        Student student1 = new Student(name1, 20, 3);

        System.out.println("Original Student:");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        Student student2 = student1.clone();
        student2.setCourse(4);
        student2.getFullName().setFirstName("Nikita");

        System.out.println("\nCloned and Modified Student:");
        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println("\nOriginal Student After Cloning:");
        System.out.println(student1.info());
        System.out.println(student1.activity());
    }
}
