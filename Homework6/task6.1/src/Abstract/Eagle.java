package Abstract;

public class Eagle extends FlyingBird{
    static final String TYPE_BIRDS = "Eagle";

    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    public  void print(){
        System.out.println("It is "+TYPE_BIRDS);
    }
}
