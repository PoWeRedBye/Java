package Zada4i;

/**
 * Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
 * первый и второй члены последовательности равны единицам, а каждый следующий - сумме двух предыдущих.
 */
public class Home2 {
    public static void main(String[] args) {
        int n = 11;
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int f = 2, i = 2;
        while (i < n) {
            f = a + b;
            a = b;
            b = f;
            System.out.print(" " + f);
            i++;
        }
    }
}
