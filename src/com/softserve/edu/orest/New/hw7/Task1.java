package com.softserve.edu.orest.New.hw7;

public class Task1 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Dog(),
                new Cat()
        };

        for (Animal animal: animals) {
            animal.voice();
            animal.feed();
        }
        
    }
}
