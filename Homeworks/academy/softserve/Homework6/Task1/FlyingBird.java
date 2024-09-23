package academy.softserve.Homework6.Task1;

public class FlyingBird extends Bird {
    int flyingSpeed;

    public FlyingBird(boolean feathers, boolean layEggs, int flyingSpeed) {
        super(feathers, layEggs);
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public boolean fly() {
        return true;
    }

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }
}
