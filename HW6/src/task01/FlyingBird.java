package task01;

public abstract class FlyingBird extends Bird{
    public FlyingBird(String feathers, boolean layEggs){
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("This is a flying bird");
    }
}
