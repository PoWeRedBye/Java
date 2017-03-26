package Zada4i;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Created by Ferotekh-Service on 15.12.2016.
 */
public class Home9 {
    public static class SimpleNum {

        public static int num(int i) {



            for (int k = 2; k < 0; k++)
                if ((i % 2 == 0) && (i / i == 0)) {


                }

            System.out.println(i);
            if (i > 2)
                System.out.println(" ");
            return num(i+1);
        }
    }

        public static void main(String[] args) throws Exception {
            SimpleNum rec = new SimpleNum();
            System.out.println("Введите целое число:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sNumbern = reader.readLine();
            int n = Integer.parseInt(sNumbern);
            System.out.println(rec.num(n));

        }
    }
/** //-->> нерекурсивное нахождение простых чисел!!!
* class Main {
*    public static void main(String[] args) {
*        int num, arg;
*        for(num = 2; num <= 100; num++) {
*            for(arg = 2; (num % arg) > 0; arg++) {
*
*            } if(arg == num)
*                System.out.print(num + "\t");
*        }
*    }
*}
*/