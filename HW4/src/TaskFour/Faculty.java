package TaskFour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Faculty {

    public enum Season {
        WINTER("Winter", "Exams Period"),
        SPRING("Spring", "Second Semester"),
        SUMMER("Summer", "Vacation Period"),
        AUTUMN("Autumn", "First Semester");

        private final String name;
        private final String description;

        Season(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }

    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    @Override
    public String toString() {
        return "Faculty Information:\n" +
                "Number of Students: " + numberOfStudents + "\n" +
                "Current Season: " + currentSeason.getName() + " (" + currentSeason.getDescription() + ")";
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numberOfStudents = scanner.nextInt();

            System.out.println("Choose the current season:");
            for (Season season : Season.values()) {
                System.out.println(season.ordinal() + 1 + ". " + season.getName());
            }

            int seasonChoice = scanner.nextInt();
            if (seasonChoice < 1 || seasonChoice > Season.values().length) {
                throw new ArrayIndexOutOfBoundsException();
            }

            Season currentSeason = Season.values()[seasonChoice - 1];

            Faculty faculty = new Faculty(numberOfStudents, currentSeason);
            System.out.println(faculty);

        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid integer for the number of students.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid input. Please choose a valid season number.");
        }
    }
}
