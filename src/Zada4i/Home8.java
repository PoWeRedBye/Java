package Zada4i;


/**
 * Подсчитайте сколько раз потребуется повторно вычислить четвёртый элемент последовательности Фибоначчи для
 * вычисления пятнадцатого элемента.
 */
public class Home8 {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }


    public static void main(String[] args) {
        int f = 15;
        int d = fib(f);
        f = 4;
        int d1 = fib(f);
        int k = (d / d1);
        System.out.println("Требуется повторно вычислить четвертый элемент " + k + " раза для вычисления пятнадцатого элемента");
    }
}