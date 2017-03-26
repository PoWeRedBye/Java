package Zada4i;

/**
 * Создать двумерный массив из  строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 * Вывести на массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю
 * произведением элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class Home6 {
    public static void main(String[] args) {
        int [][] Mas = new int [7][4];
        int [] Mas1 = new int [Mas.length];
        for (int a=0;a<Mas.length;a++){
            System.out.print("Строка №:"+a+"    ");
            for(int b=0;b<Mas[a].length;b++) {
                Mas[a][b]=(int)(Math.random()*11)-5;
                System.out.print(Mas[a][b]+" ");
                if(b==0)Mas1[a]=Mas[a][b];
                else Mas1[a]*=Mas[a][b];
                if(b==Mas[a].length-1)
                    System.out.println(" ");
            }
            }
        int c=0;
        int d=0;
        for(int e=0;e<Mas1.length;e++){
            if(Math.abs(Mas1[e])>c){
                c=Mas1[e];
                d=e;
            }
        }
        System.out.println("Строка с наибольшим по модулю произведением элементов ("+c+") имеет индекс - "+d);

    }
}
