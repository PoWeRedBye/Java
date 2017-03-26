package Zada4ki;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * В переменных a и b лежать положительные длинны катетов прямоугольного треугольника.
 * Вычислить и вывести на экран площадь треугольника и его периметр (a и b - вводит пользователь).
 */
public class Home6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumbera = reader.readLine();
        double a = Double.parseDouble(sNumbera);
        String sNumberb = reader.readLine();
        double b = Double.parseDouble(sNumberb);

        if (a > 0 && b > 0) {
            double s = 0.5 * a * b;
            System.out.println("Площадь треугольника равна: " + s);
            double g = Math.sqrt(a * a + b * b);
            double p = a + b + g;
            System.out.println("Периметр треугольника равен: " + p);
        } else {
            System.out.println("Введите положительные числа!!!");
        }
    }
}
