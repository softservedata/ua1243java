import java.util.*;

public class Student {
    private final String name;
    private final int course;

    public Student( String name,int course) {
        this.course = course;
        this.name = name;
    }
    public static void printStudent(List<Student> students){
        Iterator<Student> i = students.iterator();
        System.out.println("ArrayList of students: " );
        while(i.hasNext()){
            System.out.println(i.next());

        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name  +
                "', course=" + course +
                '}';
    }
    public static Comparator<Student> getCompByName()
    {

        return new Comparator<>(){
            @Override
            public int compare(Student s1, Student s2)
            {
                return Integer.compare(s1.name.length(), s2.name.length());
            }

        };

    }

    public static Comparator<Student> getCompByCourse()
    {
        return new Comparator<>(){
            @Override
            public int compare(Student s1, Student s2)
            {
                return Integer.compare(s1.course, s2.course);
            }

        };
    }
}
