package task03;

public class ThreadManager {
    public static void main(String[] args) {

        Thread one = new Thread(() -> {
            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
            });


            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });

            two.start();

            try {
                two.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            three.start();

            try {
                three.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        one.start();
    }
}
