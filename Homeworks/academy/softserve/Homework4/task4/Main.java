package academy.softserve.Homework4.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input number of students: ");
        int numberOfStudents = scan.nextInt();

        System.out.println("input current season: ");
        System.out.println("\'1\'- Winter");
        System.out.println("\'2\'- Spring");
        System.out.println("\'3\'- Summer");
        System.out.println("\'4\'- Autumn");
        int seasonChoose = scan.nextInt();

        Season currentSeason = null;

        switch (seasonChoose){
            case 1:
                currentSeason= Season.WINTER;
                break;
            case 2:
                currentSeason= Season.SPRING;
                break;
            case 3:
                currentSeason= Season.SUMMER;
                break;
            case 4:
                currentSeason=Season.AUTUMN;
                break;
            default:
                System.out.println("invalid number");
        }
    Faculty faculty = new Faculty(numberOfStudents, currentSeason);
        System.out.println(faculty);
    }
}
