package com.softserve.edu.orest.New.hw6.task1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(true, true),
                new Kiwi(true, true)
        };


        for (Bird bird : birds) {
            bird.fly();
        }

    }
}
