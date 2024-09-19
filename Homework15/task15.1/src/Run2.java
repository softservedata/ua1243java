public class Run2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Run2!");
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " started");

    }
}
