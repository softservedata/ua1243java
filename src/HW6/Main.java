package HW6;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            bird.displayBirdInfo();
            bird.fly();
            System.out.println();
        }
    }
}