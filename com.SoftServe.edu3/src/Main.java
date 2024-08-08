

package persons;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person person1 = new Person();
        Person.input(person1);
        Person.output(person1);

        Person person2 = new Person();
        Person.input(person2);
        Person.output(person2);
        Person person3 = new Person();
        Person.input(person3);
        Person.output(person3);

        }

    }
