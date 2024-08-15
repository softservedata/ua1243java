package task01.bird;

import task01.NonFlyingBird;

public class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("Brown feathers", true);
    }
    public void fly() {
        System.out.println("Kiwi cannot fly.");
    }
}
