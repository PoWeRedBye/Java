package Zada4ki;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Создать программу, выводящую на экран ближайшее число к 10 из двух чисел, записанных в
 * переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (m и n - вводит пользователь).
 */
public class Home5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumbern = reader.readLine();
        double n = Double.parseDouble(sNumbern);
        String sNumberm = reader.readLine();
        double m = Double.parseDouble(sNumberm);
        closeToTen(m, n);
    }

    private static void closeToTen(double m, double n) {
        if (abs(10 - n) > abs(10 - m)) {
            System.out.println("Ближайшее к 10ти: " + m);
        } else if (abs(10 - m) > abs(10 - n)) {
            System.out.println("Ближайшее к 10ти: " + n);
        } else {
            System.out.println("Ближайшее к 10ти: " + n);
        }

    }

    public static double abs(double n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }
}









