package Zada4ki;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * В переменной n хранится натуроальное двухзначное число. Создайте программу, вычисляющую
 * и выводщую на экран сумму цифр числа n(n - вводит пользователь).
 */
public class Home4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Bвод натурального числа - ");
        String sNumbern = reader.readLine();
        int n = Integer.parseInt(sNumbern);
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n/=10;
            System.out.println("sum= "+sum);
        }
    }
}


