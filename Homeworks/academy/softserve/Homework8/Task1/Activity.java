package academy.softserve.Homework8.Task1;

public class Activity extends FullName.Person {


    public Activity(int age, FullName fullName) {
        fullName.super(age, fullName);
    }

    @Override
    public String activity() {
        return "I'm studying...";
    }
}
