package homework.dmytro.livantsov.homeW_07_OOP_2Part_Task1;

import java.util.Arrays;

public class MainSalary {
    public static void main(String[] args) {
        Employee[] arr = {
                new SalariedEmployee("Dmytro Livantsov",
                        "12408", 3_200),
                new ContractEmployee("Dmitry Livantsov",
                        "13406", 120, 40.48),
                new SalariedEmployee("Alexander Shtein",
                        "20256", 4000),
                new ContractEmployee("Mark Avreliy", "55031", 150, 13)
        };

        for (Employee employee : arr){

            if (employee instanceof SalariedEmployee){
                ((SalariedEmployee) employee).calculatePay();
            }

            if (employee instanceof ContractEmployee){
                ((ContractEmployee) employee).calculatePay();
            }

        }

        Arrays.sort(arr);

        for (Employee employee : arr){
            System.out.println("\n\tName: " + employee.name + "\n\t Salary: " + employee.salaryInMonth);
        }


    }
}
