package com.softserve.edu.orest.New.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HeavyBox {
    int weight;
    String content;

    public HeavyBox(int weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {

        List<HeavyBox> boxes = new ArrayList<HeavyBox>(List.of(
                new HeavyBox(12, "Table"),
                new HeavyBox(6, "Chair"),
                new HeavyBox(2, "Lamp"),
                new HeavyBox(4, "Notebook")
        ));

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
        System.out.println("===============================================");
        boxes.get(0).setWeight(22);

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.remove(boxes.size() - 1);
        System.out.println("===============================================");

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
        System.out.println("===============================================");
        boxes.clear();

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
    }
}
