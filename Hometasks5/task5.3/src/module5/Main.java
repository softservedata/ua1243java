package module5;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Scanner SCANNER=new Scanner(System.in);
    public static void main(String[] args) {
        Car[] cars = {new Car(2024, "Jeep", 224),
                new Car(2023, "BMW", 324),
                new Car(2022, "Mercedes", 225),
                new Car(2021, "Golf", 170)
        };
        System.out.println("Please,enter year of production :");
        int year = SCANNER.nextInt();
        boolean found = false;
        for (var car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no car in this year.");
        }
        System.out.println("=".repeat(60));
        sort(cars);
        for (var car : cars) {
            System.out.println(car);

            }
    }
         static void  sort(Car[] cars){
            for (int i=0; i< cars.length-1;i++){
                for(int j=0;j<cars.length-1-i;j++){
                    if (cars[j].getYearOfProduction()<cars[j+1].getYearOfProduction())
                    {
                        var temp = cars[j];
                        cars[j]=cars[j+1];
                        cars[j+1]=temp;
                    }  }
            }

        }


}