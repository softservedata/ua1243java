package academy.softserve.Homework4.task4;
enum Season{
    WINTER("Winter Exams"),
    SPRING("Spring second semester"),
    SUMMER("Summer - vacation period"),
    AUTUMN("Autumn - first semester");
    public final String season;

    Season(String season) {
        this.season = season;
    }
}
public class Faculty {
    private int numberOfStudents;
    private Season choiseSeason;

    public Faculty(int numberOfStudents, Season choiseSeason) {
        this.numberOfStudents = numberOfStudents;
        this.choiseSeason = choiseSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getChoiseSeason() {
        return choiseSeason;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "numberOfStudents=" + numberOfStudents +
                ", choiseSeason=" + choiseSeason +
                '}';
    }
}