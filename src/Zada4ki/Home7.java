package Zada4ki;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * В три переменные a,b и c записаны три вещественных числа. Создать программу, которая
 * будет находить и выводить на экран вещественные корни квадратного уравнения
 * ax^2+bx+c=0, либо сообщать, что корней нет (a,b и c - вводит пользователь).
 */
public class Home7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumbera = reader.readLine();
        double a = Double.parseDouble(sNumbera);
        String sNumberb = reader.readLine();
        double b = Double.parseDouble(sNumberb);
        String sNumberc = reader.readLine();
        double c = Double.parseDouble(sNumberc);
        double d = (b * b) - (4 * a * c);
        double e;
        double f;
        if (d == 0) {
            e = -1 * (b / (2 * a));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен " + e);
        } else {
            if (d > 0) {
                e = ((-1 * b) + (double) Math.sqrt(d)) / (2 * a);
                f = ((-1 * b) - (double) Math.sqrt(d)) / (2 * a);
                System.out.println("Уравнение имеет 2 квадратных корня: " + e + " и " + f);
            } else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
    }
}

