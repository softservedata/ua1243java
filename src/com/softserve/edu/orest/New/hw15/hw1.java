package com.softserve.edu.orest.New.hw15;

public class hw1 {
    public static void main(String[] args) throws InterruptedException {

        CustomThread ct1 = new CustomThread("Message 1");
        CustomThread ct2 = new CustomThread("Message 2");
        CustomThread ct3 = new CustomThread("Message 3");

        Thread t1 = new Thread(ct1);
        Thread t2 = new Thread(ct2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Thread t3 = new Thread(ct3);
        t3.start();
    }
}
class CustomThread implements Runnable {
    String message;

    public CustomThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}
