public class Run3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread3 " + Thread.currentThread().getName() + " started");

        for (int i = 0; i < 5; i++) {
            synchronized (Main.monitor3) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.fillInStackTrace();
                }
                synchronized (Main.monitor1) {
                    System.out.println("Hello from Run3!");
                }
                synchronized (Main.monitor2) {
                    System.out.println("Hello from Run3!");
                }

            }


        }
        System.out.println("Thread " + Thread.currentThread().getName() + " end");

    }

}
