package Duel;

/**
 * Created by Maxim_Ozarovskiy on 02.01.2017.
 */
public class Main {

    public static void main(String[] args) {

        Maneken Maneken1 = new Maneken();

        Thread myThread1 = new Thread(Maneken1);
        Thread myThread2 = new Thread(Maneken1);

        myThread1.setName("Maneken-Vasia");
        myThread2.setName("Maneken-Petia");
        myThread1.start();
        myThread2.start();

    }

}
