package homework.dmytro.livantsov.homeW_06_OOP_1Part_Task1;

abstract class Bird {
    private String feathers;
    private String layEggs;

    abstract void fly();

    // Feathers Getters and Setters

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    // Eggs Getters and Setters

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

}
