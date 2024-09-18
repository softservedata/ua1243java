package task02;

public class DeadlockExample {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(
                () -> {
                    System.out.println(Thread.currentThread().getName() + " start");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (lock1){
                        System.out.println(Thread.currentThread().getName() + " holding lock 1 ...");
                        synchronized (lock2){
                            System.out.println(Thread.currentThread().getName() + " holding lock 2 ...");
                        }
                        System.out.println(Thread.currentThread().getName() + " end");
                    }
                }
                );

        Thread thread2 = new Thread(
                () -> {
                    System.out.println(Thread.currentThread().getName() + " start");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (lock2){
                        System.out.println(Thread.currentThread().getName() + " holding lock 2 ...");
                        synchronized (lock1){
                            System.out.println(Thread.currentThread().getName() + " holding lock 1 ...");
                        }
                        System.out.println(Thread.currentThread().getName() + " end");
                    }
                }
        );

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread end.");

    }
}
