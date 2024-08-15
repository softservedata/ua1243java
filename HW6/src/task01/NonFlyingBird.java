package task01;

public abstract class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("This is a non flying bird");
    }
}
