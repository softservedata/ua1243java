abstract class Person {
    protected String name;
    public static final String TYPE_PERSON = "Person";

    public Person(String name) {
        this.name = name;
        System.out.println("Person type: " + TYPE_PERSON);
    }

    public abstract void print();
}

abstract class Staff extends Person {
    public static final String TYPE_PERSON = "Staff";

    public Staff(String name) {
        super(name);
        System.out.println("Person type: " + TYPE_PERSON);
    }

    public abstract double salary();
}

class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println("Person type: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Teacher. My name is " + name + ".");
    }

    @Override
    public double salary() {
        return 5000.0;
    }
}

class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println("Person type: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Cleaner. My name is " + name + ".");
    }

    @Override
    public double salary() {
        return 2500.0;
    }
}

class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println("Person type: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Student. My name is " + name + ".");
    }
}
public class pr2_lesson7 {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Teacher("Oleg300");
        people[1] = new Cleaner("Oleg3000");
        people[2] = new Student("Oleg3");
        people[3] = new Teacher("Oleg30");

        for (Person person : people) {
            person.print();
        }

        for (Person person : people) {
            if (person instanceof Staff) {
                Staff staff = (Staff) person;
                System.out.println(person.name + "'s salary: $" + staff.salary());
            }
        }
    }
}
