package task01.bird;

import task01.FlyingBird;

public class Swallow extends FlyingBird {
    public Swallow(){
        super("Black and white feathers", true);
    }
    public void fly(){
        System.out.println("The swallow flies swiftly.");
    }
}
