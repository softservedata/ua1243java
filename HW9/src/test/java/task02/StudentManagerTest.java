package task02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    private List<Student> students;

    @BeforeEach
    public void setUp() {
        students = new ArrayList<>();

        Student student1 = new Student("Alice", "A1", 1);
        student1.addGrade("Math", 4);
        student1.addGrade("English", 5);

        Student student2 = new Student("Bob", "A2", 2);
        student2.addGrade("Math", 2);
        student2.addGrade("English", 2);

        Student student3 = new Student("Charlie", "A1", 2);
        student3.addGrade("Math", 3);
        student3.addGrade("English", 4);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    @Test
    public void testRemoveOfUnsuccessful() {

        StudentManager.removeOfUnsuccessful(students);

        assertEquals(2, students.size());

        Student alice = findStudentByName(students, "Alice");
        assertNotNull(alice);
        assertEquals(2, alice.getCourse());

        Student charlie = findStudentByName(students, "Charlie");
        assertNotNull(charlie);
        assertEquals(3, charlie.getCourse());

        Student bob = findStudentByName(students, "Bob");
        assertNull(bob);
    }

    @Test
    public void testPrintStudents() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        StudentManager.printStudents(students, 2);

        System.setOut(originalOut);

        String output = outputStream.toString();
        assertFalse(output.contains("Alice"));
        assertTrue(output.contains("Charlie"));
        assertTrue(output.contains("Bob"));
    }

    @Test
    public void testRemoveOfUnsuccessfulEmpty() {
        List<Student> emptyList = new ArrayList<>();
        StudentManager.removeOfUnsuccessful(emptyList);
        assertTrue(emptyList.isEmpty());
    }

    private Student findStudentByName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}
