
public class Main{
    final static Object monitor1 = new Object();
    final static Object monitor2 = new Object();
    final static Object monitor3 = new Object();
    public static void main(String[] args){
        Runnable r1 = new Run1();
        Runnable r2 = new Run2();
        Runnable r3 = new Run3();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
    }
}




