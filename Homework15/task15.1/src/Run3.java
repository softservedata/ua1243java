import static java.lang.Thread.sleep;

public class Run3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Run3!");
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " started");

    }
}
