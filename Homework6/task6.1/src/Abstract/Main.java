package Abstract;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Birds[] arrayOfBirds = new Birds[]{new Eagle("dark-gray or gray-brown",2),
                new Penguin("black and white",2),
                new Swallow("blue-green above and white below",4),
                new Kiwi("dark brown",1),
        };

        //System.out.println(Arrays.toString(arrayOfBirds));

        for (var arrayOfBird : arrayOfBirds) {
            arrayOfBird.fly();
            arrayOfBird.print();

            System.out.println(arrayOfBird+"\n");




        }

    }
}


