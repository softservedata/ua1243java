package task03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class StudentOperationsTest {

    @Test
    public void testPrintStudents() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 3));

        StudentOperations.printStudents(students);

        String expectedOutput = "2: Alice\n1: Bob\n3: Charlie\n";
        String actualOutput = outContent.toString().replace("\r\n", "\n");
        assertEquals(expectedOutput, actualOutput);

        System.setOut(originalOut);
    }

    @Test
    public void testPrintStudentsByCourse() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 2));

        StudentOperations.printStudentsByCourse(students, 2);

        String expectedOutput = "Alice\nCharlie\n";
        String actualOutput = outContent.toString().replace("\r\n", "\n");
        assertEquals(expectedOutput, actualOutput);

        System.setOut(originalOut);
    }

    @Test
    public void testCompareByName() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 2));
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));

        students.sort(StudentOperations.compareByName());

        assertEquals("Alice", students.get(0).getName());
        assertEquals("Bob", students.get(1).getName());
        assertEquals("Charlie", students.get(2).getName());
    }

    @Test
    public void testCompareByCourse() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 3));

        students.sort(StudentOperations.compareByCourse());

        assertEquals(1, students.get(0).getCourse());
        assertEquals(2, students.get(1).getCourse());
        assertEquals(3, students.get(2).getCourse());
    }
}
