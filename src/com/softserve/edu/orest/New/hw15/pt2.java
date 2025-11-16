package com.softserve.edu.orest.New.hw15;

public class pt2{
//    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello, world");
//            Thread.sleep(2000);
//            System.out.println("Peace in the peace");
//            Thread.sleep(3000);
//        }
//        System.out.println("My name is ");
//    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread("Hello, world", 2000);
        Thread t2 = new MyThread("Peace in the peace", 3000);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Orest");
    }
}
class MyThread extends Thread{
    String message;
    int sleep;

    public MyThread(String message, int sleep) {
        this.message = message;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {}
            System.out.println(message);
        }
    }
}
