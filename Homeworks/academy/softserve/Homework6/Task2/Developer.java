package academy.softserve.Homework6.Task2;

public class Developer extends Employee{
    private String position;
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return super.report()+" "+position;
    }
}
