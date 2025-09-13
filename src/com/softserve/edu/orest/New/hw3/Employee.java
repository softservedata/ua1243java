package com.softserve.edu.orest.New.hw3;

public class Employee {

    private static final double BONUS_RATE = 0.1;
    public static void main(String[] args) {
        Employee employee1 = new Employee("Viktor", 9, 40);
        Employee employee2 = new Employee("Tom", 9.5, 38);
        Employee employee3 = new Employee("Anna", 8, 35);

        System.out.println("Employee1: " + employee1);
        System.out.println("Employee2: " + employee2);
        System.out.println("Employee3: " + employee3);
        System.out.println(totalSum);

    }
    private static double totalSum;

    private String name;
    private double rate;
    private int hours;

    public double getSalary(){
        return getRate() * getHours();
    }
    private double getBonuses(){
        return getSalary() * BONUS_RATE;
    }
    private double totalSum(){
        return getSalary() + getBonuses();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses=" + getBonuses() +
                '}';
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum -= oldSalary;
        totalSum += newSalary;
    }

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum -= oldSalary;
        totalSum += newSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
}
