package Tamagochi;


/**
 *
 */

public class Animal implements Runnable {  //First

    @Override
    public void run() {                 //First
        boolean isAlive = true;
        while (isAlive) {
            eat += EAT_STEP;
            if (eat > (EAT_MAX - 3 * EAT_STEP)) {
                System.out.println("I want eat!!!!");
            }
            sleep += SLEEP_STEP;
            if (sleep > (SLEEP_MAX - 4 * SLEEP_STEP)) {
                System.out.println("I want to sleep!!!!");
            }
            toilet += TOILET_STEP;
            if (toilet > (TOILET_MAX - 5 * TOILET_STEP)) {
                System.out.println("I want to go to the toilet!!!!");
            }

            if (eat > EAT_MAX || sleep > SLEEP_MAX || toilet > TOILET_MAX) {
                isAlive = false;
                System.out.println("DEAD");
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private int eat;
    private int sleep;              //  1
    private int toilet;


    public boolean isWantEat() {
        return wantEat;
    }

    public boolean isWantSleep() {              //  2
        return wantSleep;
    }

    public boolean isWantToilet() {
        return wantToilet;
    }


    private boolean wantEat;
    private boolean wantSleep;              //  2
    private boolean wantToilet;


    private final static int EAT_MAX = 100;
    private final static int SLEEP_MAX = 100;           //  1
    private final static int TOILET_MAX = 100;

    private final static int EAT_STEP = 12;
    private final static int SLEEP_STEP = 8;            //  1
    private final static int TOILET_STEP = 10;

    public void giveEat() {
        eat = 0;
        wantEat = false;
    }

    public void giveSleep() {                //  3
        sleep = 0;
        wantSleep = false;
    }

    public void giveToilet() {
        toilet = 0;
        wantToilet = false;
    }


}

