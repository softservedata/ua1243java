package Abstract;

public class FlyingBird extends Birds {

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This birds can fly!");
    }
    @Override
    public  void print(){};
}
