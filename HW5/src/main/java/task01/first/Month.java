package task01.first;

public enum Month {
    JANUARY("January", 1, 31),
    FEBRUARY("February", 2, 28), // Default 28 days
    MARCH("March", 3, 31),
    APRIL("April", 4, 30),
    MAY("May", 5, 31),
    JUNE("June", 6, 30),
    JULY("July", 7, 31),
    AUGUST("August", 8, 31),
    SEPTEMBER("September", 9, 30),
    OCTOBER("October", 10, 31),
    NOVEMBER("November", 11, 30),
    DECEMBER("December", 12, 31);

    private final String name;
    private final int number;
    private final int days;

    Month(String name, int number, int days) {
        this.name = name;
        this.number = number;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return number + ". " + name;
    }
}
