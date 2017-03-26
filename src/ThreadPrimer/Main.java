package ThreadPrimer;

/**
 * Created by Maxim_Ozarovskiy on 24.12.2016.
 */
public class Main {
    public static boolean aBoolean = false;
    public static final boolean monitorA = false;
    public static boolean monitorB = false;
    public static void main(String[] args) throws InterruptedException {
        Thread myThread1 = new Thread( ()-> {

                monitorA(false);

        });
        Thread myThread2 = new Thread(() -> {

                monitorB(false);
        });

        myThread1.setDaemon(true);
        myThread2.setDaemon(true);
        myThread1.start();
        myThread2.start();
        while(myThread1.isAlive() || myThread2.isAlive()){
            System.out.println("I'm need SLEEP!!!!!!!!!!!");
            //Thread.sleep(500);
        }
    }

    public static synchronized void monitorA(boolean needExit){
       // synchronized (monitorA){
        try{
            Thread.sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (needExit) return;

        monitorB(true);
    }
    public static synchronized void monitorB(boolean needExit){
       // synchronized (monitorB){
        try{
            Thread.sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (needExit) return;
        monitorA(true);
    }
}
