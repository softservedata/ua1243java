public class Student extends Person implements Cloneable{
    private int course;
    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info(){
        return super.info() + ", course: " + this.course;
    }

    @Override
    public String activity() {
        return "I study at university.";
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public Student clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.setFullName(this.getFullName().clone());
        return copyOfStudent;
    }
}
