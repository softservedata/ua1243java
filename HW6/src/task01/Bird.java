package task01;

public abstract class Bird {
    private String feathers;
    private boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public boolean isLayEggs() {
        return layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    @Override
    public String toString() {
        return "Feathers: " + feathers + ", LayEggs:" + layEggs;
    }
}
