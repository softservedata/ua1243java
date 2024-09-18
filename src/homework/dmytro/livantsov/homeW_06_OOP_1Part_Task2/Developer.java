package homework.dmytro.livantsov.homeW_06_OOP_1Part_Task2;

public class Developer extends Employee {

    private String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return "\n\tDeveloper's name: " + super.getName()
                + "\n\tDeveloper's age: " + super.getAge()
                + "\n\tPosition: " + position
                + "\n\tSalary: " + super.getSalary()
                + "\n ";
    }
}
