package task4;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        private static final Scanner SCANNER = new Scanner(System.in);
        public static void main(String[] args) {
                System.out.println("Please enter the number of students ");
                int numbersOfStudents = SCANNER.nextInt();
                CurrentSeason currentSeason = CurrentSeason.getByNumber(numbersOfStudents);
                System.out.println("This number corresponds to: "+currentSeason.englishName);
                System.out.println("Це число відповідає: "+currentSeason.ukrainianName);

        }

        }

