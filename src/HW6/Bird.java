package HW6;

abstract class Bird {
    String feathers;
    boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void displayBirdInfo() {
        System.out.println("Feathers: " + feathers + ", Lays Eggs: " + layEggs);
    }
}
