public class Run2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println( " Thread number three ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ignored){}
        }
    }
}
