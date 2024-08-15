package task01.bird;

import task01.NonFlyingBird;

public class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Black and white feathers", true);
    }
    public void fly() {
        System.out.println("Penguins cannot fly.");
    }
}
