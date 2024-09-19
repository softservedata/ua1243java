
public class Main{
    public static void main(String[] args) throws InterruptedException {
            Runnable r1 = new Run1();
            Runnable r2 = new Run2();
            Runnable r3 = new Run3();
            Thread t1 = new Thread(r1);
            Thread t2 = new Thread(r2);
            Thread t3 = new Thread(r3);
            t1.start();
            t2.start();
            t3.start();
            t1.join();
            t2.join();

        }
    }




