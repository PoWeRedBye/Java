package Zada4i;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** Для введенного пользователем с клавиатуры натурального числа посчитайте
 * сумму всех его цифр(заранее не известно сколько цифр будет в числе)
 */
public class Home1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumbera = reader.readLine();
        int a = Integer.parseInt(sNumbera);
        int b = 0;
        while (a != 0) {
            b = b + a % 10;
            a /= 10;
        }

        System.out.println("Сумма всех чисел введенного числа равна " + b);
    }


    }

