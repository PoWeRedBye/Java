package Palindrom;

/**
 * Created by Maxim_Ozarovskiy on 07.02.2017.
 */

public class Palindrom {

    public static void main(String[] args) {
        int a = 999;
        int b = 999;
        int max = 0;
        while (a > 100) {
            int num = a * b;
            if (checkPallendrome(num)) {
                if (num > max)
                    max = num;
            }
            if (b >= 100)
                b--;
            else {
                a--;
                b = 999;
            }
        }
        System.out.println(max);
    }
    public static boolean checkPallendrome(int num) {
        String a = num + "";
        String b = new StringBuffer(num + "").reverse().toString();
        if (a.equals(b))
            return true;
        return false;
    }
}

