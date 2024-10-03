package academy.softserve.Homework8.Task1;

public class App {
    public static void main(String[] args) {
        FullName person1 = new FullName("Andrii", "Zakordonskyi");
        FullName person2 = new FullName("Olha", "Shutylieva");

        Activity student = new Activity(18, person1);
        System.out.println(student.toString());
        System.out.println(student.activity());

        FullName.Person teacher = person2.new Person(28, person2) {
            @Override
            public String activity() {
                return "I'm teaching...";
            }
        };
        System.out.println(teacher.toString());
        System.out.println(teacher.activity());
    }
}