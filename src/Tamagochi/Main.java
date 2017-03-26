package Tamagochi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Maxim_Ozarovskiy on 29.12.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Animal Dog = new Animal();
        Thread myThread1 = new Thread(Dog);
        myThread1.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumbern = reader.readLine();
        int n = Integer.parseInt(sNumbern);


        switch (n) {
            case 1:
                Dog.giveEat();
            case 2:
                Dog.giveSleep();
            case 3:
                Dog.giveToilet();

        }
    }
}

