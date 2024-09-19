public class Run1  implements Runnable{
    private final int threadNumber;

    public Run1(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for(int i=0;i<4;i++){
            System.out.println( " Thread number two "+ threadNumber );
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ignored){}
        }
    }
}
