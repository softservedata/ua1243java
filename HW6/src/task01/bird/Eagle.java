package task01.bird;

import task01.FlyingBird;

public class Eagle extends FlyingBird {
    public Eagle() {
        super("Brown and white feathers", true);
    }
    public void fly() {
        System.out.println("The eagle soars high in the sky.");
    }
}
