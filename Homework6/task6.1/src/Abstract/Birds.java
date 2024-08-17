package Abstract;

public abstract class Birds {
    protected  String feathers;
    protected int layEggs;

    public Birds(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public abstract void fly();

public abstract void print();
    @Override
    public String toString() {
        return "Feathers: " + feathers + ", " +
                "LayEggs:" + layEggs;
    }
}
