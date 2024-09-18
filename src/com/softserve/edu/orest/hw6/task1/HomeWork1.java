package com.softserve.edu.orest.hw6.task1;

public class HomeWork1 {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};

        for (int i = 0; i < birds.length; i++) {
            birds[i].fly();
        }

    }
}


