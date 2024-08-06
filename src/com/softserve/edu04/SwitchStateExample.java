package com.softserve.edu04;

import java.util.Random;

public class SwitchStateExample {

    public static void main(String[] args) {
        Random rand = new Random();
        int day = rand.nextInt(7) + 1;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid value");
                // break;//can be removed
        }

        //other way
        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Workday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid value");
                //   break;// can be removed
        }

    }
}
