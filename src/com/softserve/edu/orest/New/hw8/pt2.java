package com.softserve.edu.orest.New.hw8;

import java.util.Scanner;

public class pt2 {

    public static void main(String[] args) throws ColorException, TypeException {
        Plant[] plants = new Plant[5];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }

        for (var plant : plants) {
            System.out.println(plant);
        }
    }
}
