package Duel;


import static java.lang.Thread.*;

/**
 * Created by Maxim_Ozarovskiy on 02.01.2017.
 */

public class Maneken implements Runnable {
    @Override
    public void run() {
        boolean isAlive = true;
        while (isAlive) {

            if (hp > MANEKEN_HP) {
                System.out.println("*!*!*!*->DEAD<-*!*!*!*");
                isAlive = false;

            }
            if (chance > 0) {
                shot += 1;
                hp += dmg;
                System.out.println(Thread.currentThread().getName() + " shot = " + dmg);
            }

            if (shot == MAGAZIN_AK47) {
                System.out.println("Need Reaload AK-47!!!");
                giveReload();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean needReload;
    private static int MANEKEN_HP = 200;
    private static int MAGAZIN_AK47 = 30;
    private int dmg = (int) (11 * Math.random());
    private int chance = (int) (8 * Math.random() - 3);
    private int hp;
    private int shot;

    private void giveReload() {
        shot = 0;
        needReload = false;
    }
}

