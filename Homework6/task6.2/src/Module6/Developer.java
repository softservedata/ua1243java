package Module6;

public class Developer extends Employee {
    private String position;

    public Developer(String name,int age, String position, double salary) {
        super(name, age, salary);
        this.position=position;
    }

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s, Salary: ₴ %.2f.", getName(), getAge(), position, getSalary());


    };

    public String getPosition() {
        return position;
    }


}
