package Zada4i;

/**
 * Создать двумерный масив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка
 * [10;99]. Вынести массив на экран.
 */
public class Home5 {
    public static void main(String[] args) {
        int [][] Mas = new int [8][5];
        for (int a=0;a<Mas.length;a++){
            for(int b=0;b<Mas[a].length;b++){
                Mas[a][b]=(int)(Math.random()*90)+10;
                System.out.print(Mas[a][b]+" ");
            }
            System.out.println("  * :-) Тут может быть ваша реклама :-) * ");
        }

    }
}
