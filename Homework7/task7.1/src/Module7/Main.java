package Module7;

public class Main {
    public static void main(String[] args) {
Employee[] employees = {
        new SalariedEmployee("2323","Maks",335,"372457"),
        new ContractEmployee("24424","Oleksandr",2633)
};
        System.out.println(employees[0].report());
        System.out.println(employees[1].report());

    }
}