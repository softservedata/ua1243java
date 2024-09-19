public class Run2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread2 " + Thread.currentThread().getName() + " started");

        for (int i = 0; i < 5; i++) {
            synchronized (Main.monitor2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.fillInStackTrace();
                }
                synchronized (Main.monitor1) {
                    System.out.println("Hello from Run2");
                }
                synchronized (Main.monitor3) {
                    System.out.println("Hello from Run2!");
                }

            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " end");

    }

}
