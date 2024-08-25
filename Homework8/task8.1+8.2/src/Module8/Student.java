package Module8;

public class Student extends Person implements Cloneable {
    private final int amountOfCourse;
    private String courseList ;

    public Student( FullName fullName,int age, int amountOfCourse, String courseList) {
        super(fullName,age);
        this.amountOfCourse = amountOfCourse;
        this.courseList = courseList;
    }



    public void setCourseList(String courseList) {
        this.courseList=courseList;
    }

    @Override
    public String info() {
       return super.info() + " Amount of course: '" + this.amountOfCourse +  '\''
               +" Course list: '" + this.courseList + '\'';
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
   protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.setCourseList("");
        return copyOfStudent;
    }



}
