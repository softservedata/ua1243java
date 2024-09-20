import java.util.Scanner;

class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public enum Season {
        WINTER("Winter"),
        SPRING("Spring"),
        SUMMER("Summer"),
        AUTUMN("Autumn");

        private final String name;

        Season(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = scan.nextInt();

        System.out.println("Enter the current season (WINTER, SPRING, SUMMER, AUTUMN):");
        String seasonInput = scan.next().toUpperCase();
        Season currentSeason = Season.valueOf(seasonInput);

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason().getName());
    }
}
