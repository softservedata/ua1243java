package com.softserve.edu14comp;

import java.util.Arrays;

public class AppStud {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Oksana", 28);
        students[1] = new Student("Oksana", 17);
        students[2] = new Student("Oksana", 19);
        students[3] = new Student("Bogdan", 42);
        students[4] = new Student("Orest", 17);
        //
        System.out.println(" Original: " + Arrays.toString(students));
        // Arrays.sort(students); // Using Comparable
        Arrays.sort(students, new Student.ByNameAndAge());
        System.out.println("   Sorted: " + Arrays.toString(students));
    }
}
