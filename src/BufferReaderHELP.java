/**
 * Created by Ferotekh-Service on 24.11.2016.
 */
package com.company;
import java.io.*;
public class BufferReaderHELP
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumbera = reader.readLine();
        int a = Integer.parseInt(sNumbera);
        String sNumberb = reader.readLine();
        double b = Double.parseDouble(sNumberb);

        String name1 = reader.readLine();
        String name2 = reader.readLine();
        System.out.println (name1 + name2 + a +b);
    }
}
