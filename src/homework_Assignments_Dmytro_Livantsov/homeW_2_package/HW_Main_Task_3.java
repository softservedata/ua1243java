package homework_Assignments_Dmytro_Livantsov.homeW_2_package;

public class HW_Main_Task_3 {
    public static void main(String[] args) {

        Person person_1 = new Person();
        Person person_2 = new Person("Jacob", "Abramovic");
        Person person_3 = new Person();
        Person person_4 = new Person();
        Person person_5 = new Person();

        System.out.println("Input information about first person!");
        person_1.input();
//
//        System.out.println("Input information about second person!");
//        person_2.input();
//
//        System.out.println("Input information about third person!");
//        person_3.input();
//
//        System.out.println("Input information about fourth person!");
//        person_4.input();
//
//        System.out.println("Input information about fifth person!");
//        person_5.input();


        System.out.println("Information about all people: ");
        person_1.outPut();
//        person_2.outPut();
//        person_3.outPut();
//        person_4.outPut();
//        person_5.outPut();

        person_1.changeName("John", "Walsh");
        person_1.outPut();
        person_1.getAge();
    }
}
