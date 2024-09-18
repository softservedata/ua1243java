package task01;

public class ThreadManagerApp {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> printMessage("Thread first"));
        Thread thread2 = new Thread(() -> printMessage("Thread second"));
        Thread thread3 = new Thread(() -> printMessage("Thread third"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread3.start();
    }

    private static void printMessage(String threadName) {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
