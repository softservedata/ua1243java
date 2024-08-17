package Abstract;

public class NonFlyingBird extends Birds{

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);

    };

    @Override
    public void fly() {

        System.out.println("This birds can not fly!");
    }
    @Override
    public  void print(){};

}
