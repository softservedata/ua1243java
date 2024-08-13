class Employee {
    private String name;
    private double rate;
    private int hours;

    private static double totalSum = 0;
    private static double totalSumWithBonuses = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    //default constructor
    public Employee() {
        this.name = "";
        this.rate = 0;
        this.hours = 0;
    }
    // Constructor with parameters(name, rate, hours)
    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
        totalSumWithBonuses += getBonuses() + getSalary();
    }
    // Constructor with parameters(name, rate)
    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        this.hours = 0;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.10;
    }
    @Override
    public String toString() {
        return "Employee Name: " + name + ", Rate: " + rate + ", Hours: " + hours +
                ", Salary: " + getSalary() + ", Bonuses: " + getBonuses();
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static double getTotalSumWithBonuses() {
        return totalSumWithBonuses;
    }
}

public class pr2_lesson3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Oleg", 100.0, 40);
        Employee emp2 = new Employee("Max", 380.0, 18);
        Employee emp3 = new Employee("Orest", 240.0, 32);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("Total Salary of all employees: " + Employee.getTotalSum());
        System.out.println("Total Salary with bonuses of all employees: " + Employee.getTotalSumWithBonuses());
    }
}
