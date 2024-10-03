package academy.softserve.Homework8.Task2;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Andrii", "Zakordonskyi", 2);
        Student student2 = new Student("Dima", "Zakordonskyi", 5) {
            @Override
            String activity() {
                return super.activity() + "I'm ending.";
            }
        };
        Student student3 = new Student("Pavlo", "Shparkyi", 2);
        Student student4 = new Student(student1);

        student1.info();
        student2.info();
        student3.info();
        student4.info();
    }
}
