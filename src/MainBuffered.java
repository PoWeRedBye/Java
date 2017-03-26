/**
 * Created by Ferotekh-Service on 25.11.2016.
 */


import java.io.*;
import java.util.Random;

public class MainBuffered
{
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        int randomInt = random.nextInt(200) + 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("so....?");
        String Customer1 = reader.readLine();
        int customerInt1 = Integer.parseInt(Customer1);
        System.out.println("and.....?");
        String Customer2 = reader.readLine();
        int customerInt2 = Integer.parseInt(Customer2);
        System.out.println("-----------------------------------------------");
        System.out.println(victory(randomInt, customerInt1, customerInt2));
        System.out.println("random = " + randomInt);
        System.out.println("& = " + (customerInt1 & customerInt2));
        System.out.println("| = " + (customerInt1 & customerInt2));
        System.out.println("^ = " + (customerInt1 & customerInt2));
    }

    public static String victory(int randomInt, int customerInt1, int customerInt2) {
        return randomInt == (customerInt1 & customerInt2) ||
                randomInt == (customerInt1 | customerInt2) ||
                randomInt == (customerInt1 ^ customerInt2) ?
                "You WIN" : "MMM...NO";
    }

}
