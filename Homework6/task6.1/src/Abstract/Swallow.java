package Abstract;

public class Swallow  extends FlyingBird{
    static final String TYPE_BIRDS = "Swallow";
    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    public void print(){
        System.out.println("It is "+TYPE_BIRDS);
    }
}
