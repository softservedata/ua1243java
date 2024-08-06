package com.softserve.edu04;

/**
 * The CountsDaysInMonth class calculates the number of days in a given month.
 */
public class CountsDaysInMonth {

    private int month;
    private int year;

    /**
     * Constructor to initialize month and year.
     *
     * @param month The month (from 1 to 12)
     * @param year  The year
     */
    public CountsDaysInMonth(int month, int year) {
        this.month = month;
        this.year = year;
    }

    /**
     * Method to determine the number of days in the month.
     *
     * @return the number of days in the month
     */
    public int getDaysInMonth() {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if (isLeapYear(year)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
    }

    /**
     * Method to check if a year is a leap year.
     *
     * @param year The year
     * @return true if the year is a leap year, false otherwise
     */
    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CountsDaysInMonth{" +
                "month=" + month +
                ", year=" + year +
                '}';
    }
}

class Demo {
    public static void main(String[] args) {

        CountsDaysInMonth counter = new CountsDaysInMonth(2, 2024);
        int days = counter.getDaysInMonth();
        System.out.println("Number of days in the month: " + days);

    }
}
