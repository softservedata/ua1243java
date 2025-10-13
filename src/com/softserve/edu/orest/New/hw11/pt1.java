package com.softserve.edu.orest.New.hw11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Orest");
        employeeMap.put(2, "Vova");
        employeeMap.put(3, "Misha");
        employeeMap.put(4, "Ostap");
        employeeMap.put(5, "Anna");
        employeeMap.put(6, "Natalia");
        employeeMap.put(7, "Olga");

        for (Map.Entry m : employeeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("There is no such employee");
        }

        System.out.println("Enter the name: ");
        String name = scanner.nextLine().trim();

        boolean found = false;
        for (var entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println(entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no such employee");
        }


//        if (employeeMap.containsValue(name)) {
//            for (var entry : employeeMap.entrySet()) {
//                if (entry.getValue().equals(name)) {
//                    System.out.println(entry.getKey());
//                }
//            }
//        } else {
//            System.out.println("There is no such employee");
//        }

    }
}
