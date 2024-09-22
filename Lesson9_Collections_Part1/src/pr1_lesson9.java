import java.util.ArrayList;

class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }
}

public class pr1_lesson9 {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(10, "Books"));
        boxes.add(new HeavyBox(20, "Electronics"));
        boxes.add(new HeavyBox(15, "Toys"));

        System.out.println("Initial boxes:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        if (!boxes.isEmpty()) {
            boxes.get(0).setWeight(boxes.get(0).getWeight() + 1);
        }

        if (!boxes.isEmpty()) {
            boxes.remove(boxes.size() - 1);
        }

        System.out.println("\nAfter modifications:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.clear();

        System.out.println("\nAfter removing all boxes:");
        if (boxes.isEmpty()) {
            System.out.println("No boxes left.");
        }
    }
}
