

package persons;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //  Scanner scan = new Scanner(System.in);//you have created scanner in line 10

        Person person1 = new Person();
        person1.input();// person1 is an object, why are you calling input method as static?
        person1.output();
        person1.changeName("Alice", "Green");

        Person person2 = new Person("Alice", "Green");
        person2.changeName("Alice", "Brown");
        person2.output();
//        Person person2 = new Person();
//        Person.input(person2);
//        Person.output(person2);
//        Person person3 = new Person();
//        Person.input(person3);
//        Person.output(person3);
    }
}
