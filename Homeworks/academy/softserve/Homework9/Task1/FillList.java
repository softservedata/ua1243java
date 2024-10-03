package academy.softserve.Homework9.Task1;

import java.util.Random;
import java.util.Scanner;

public class FillList {
    private Random rand;
    private Scanner scan;

    public FillList() {
        rand = new Random();
        scan = new Scanner(System.in);
    }

    public void inputList(ManagerList managerList) {
        System.out.println("Input 10 integers, " +
                "if you want to random these numbers press Enter");
        for (int i = 0; i < 10; i++) {
            String numbers = scan.nextLine();
            if (numbers.isEmpty()) {
                for (int j = i; j < 10; j++) {
                    managerList.addNumber(rand.nextInt(201) - 100);
                }
                break;
            } else {
                managerList.addNumber(Integer.parseInt(numbers));
            }
        }
    }
}

