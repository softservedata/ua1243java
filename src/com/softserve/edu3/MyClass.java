package com.softserve.edu3;

public class MyClass {

    public static void printMessage() {
        System.out.println("No message provided");
    }

    public static void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Message: " + message);
        }
    }
}
class Runner{
    public static void main(String[] args) {
        MyClass.printMessage();
        MyClass.printMessage("Hello!");
        MyClass.printMessage("Hi group UA-1243", 3);
    }
}