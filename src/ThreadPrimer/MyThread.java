package ThreadPrimer;

/**
 * Created by Maxim_Ozarovskiy on 24.12.2016.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(Main.aBoolean){
                System.out.println(this.getName());
                System.out.println("YEACH!!!");
                Main.aBoolean = false;
            }else{
                System.out.println("//////////////////////////////////////////////////");
                System.out.println("NOOOOOOOOOOO!! I'm not your son");
                Main.aBoolean = true;
                System.out.println("//////////////////////////////////////////////////");
            }
            //System.out.println(this.getName() + "  : " + i + "counter");
        }

    }
}
