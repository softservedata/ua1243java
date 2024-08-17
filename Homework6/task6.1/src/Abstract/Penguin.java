package Abstract;

public class Penguin extends NonFlyingBird{
    static final String TYPE_BIRDS = "Penguin";
    public Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public  void print(){
        System.out.println("It is "+TYPE_BIRDS);
    }
}
