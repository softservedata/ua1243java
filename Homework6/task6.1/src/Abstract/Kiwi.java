package Abstract;

public class Kiwi extends NonFlyingBird{
    static final String TYPE_BIRDS = "Kiwi";

    public Kiwi(String feathers, int layEggs) {
        super(feathers, layEggs);

    }
    public  void print(){
        System.out.println("It is "+TYPE_BIRDS);
    }
}
