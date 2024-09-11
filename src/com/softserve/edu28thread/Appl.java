package com.softserve.edu28thread;

public class Appl {
    public static void main(String[] args) {
        DialogTime dt = new DialogTime();
        dt.setVisible(true);
        System.out.println("main(): Thread ID = " + Thread.currentThread().getId());
    }
}