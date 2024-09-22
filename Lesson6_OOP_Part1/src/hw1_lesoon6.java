abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void printInfo() {
        System.out.println("Feathers: " + feathers + ", Lays Eggs: " + (layEggs ? "Yes" : "No"));
    }
}

abstract class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying.");
    }
}

abstract class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " cannot fly.");
    }
}

class Eagle extends FlyingBird {

    public Eagle() {
        super("Brown feathers", true);
    }
}

class Swallow extends FlyingBird {

    public Swallow() {
        super("Gray feathers", true);
    }
}

class Penguin extends NonFlyingBird {

    public Penguin() {
        super("Black and white feathers", true);
    }
}

class Kiwi extends NonFlyingBird {

    public Kiwi() {
        super("Brown feathers", true);
    }
}

public class hw1_lesoon6 {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            bird.printInfo();
            bird.fly();
            System.out.println();
        }
    }
}
