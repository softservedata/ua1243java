package com.softserve.edu.orest.New.hw15;

public class hw2 {
    static final Object first = new Object();
    static final Object second = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (first) {
                System.out.println("Thread-1: Locked first");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}

                System.out.println("Thread-1: Waiting for second");

                synchronized (second) {
                    System.out.println("Thread-1: Locked second");
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            synchronized (second) {
                System.out.println("Thread-2: Locked second");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}

                System.out.println("Thread-2: Waiting for first");

                synchronized (first) {
                    System.out.println("Thread-2: Locked first");
                }
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        try {
            long timeout = 5000;

            System.out.println("\nMain: Waiting up to " + timeout);

            t1.join(timeout);
            t2.join(timeout);

            if (t1.isAlive() || t2.isAlive()) {
                System.out.println("\nMain: Deadlock");
                System.out.println("Thread-1 is Alive: " + t1.isAlive());
                System.out.println("Thread-2 is Alive: " + t2.isAlive());

                t1.interrupt();
                t2.interrupt();
            } else {
                System.out.println("Main: Threads finished successfully.");
            }

        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted while waiting.");
        }

        System.out.println("\nMain: End of main() method.");
    }
}
