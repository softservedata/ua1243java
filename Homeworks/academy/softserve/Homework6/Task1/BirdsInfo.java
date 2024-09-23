package academy.softserve.Homework6.Task1;

public class BirdsInfo {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true, true, 120);
        birds[1] = new Swallow(true, true, 70);
        birds[2] = new Penguin(true, true);
        birds[3] = new Kiwi(true, true);

        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName() + ": " + bird.toString());
            if (bird.fly()) {
                System.out.println("This bird can fly");
            } else {
                System.out.println("This bird can't fly");
            }
            System.out.println();
        }

    }
}
