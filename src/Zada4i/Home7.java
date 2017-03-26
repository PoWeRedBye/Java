package Zada4i;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n.
 */
public class Home7 {
    public static int sum(int n) {
        return (n > 1) ? n + sum(n - 1) : n;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumbern = reader.readLine();
        int n = Integer.parseInt(sNumbern);
        System.out.println(sum(n));


    }

    }
