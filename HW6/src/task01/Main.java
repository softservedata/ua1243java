package task01;

import task01.bird.Eagle;
import task01.bird.Kiwi;
import task01.bird.Penguin;
import task01.bird.Swallow;

public class Main {
    public static void main(String[] args) {
        Bird [] birds = new Bird[]{new Eagle(), new Penguin(), new Kiwi(), new Swallow()};
        for (Bird bird : birds) {
            bird.fly();
            System.out.println(bird + "\n");
        }
    }
}
