package Zada4ki;

/**
 * Создать программу, проверяющую и сообщающую на экран, является ли целое число,
 * записанное в переменную n, чётным либо нечётным (n - вводит пользователь).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Home3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumbern = reader.readLine();
        int n = Integer.parseInt(sNumbern);
        boolean b = n % 2 == 0;


        if (b)
            System.out.println("n - чётное число");
        else
            System.out.println("n - нечётное число");
    }
}
