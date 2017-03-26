package BookStorage.com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Utils.addMockBooks();
        Utils.renderMenu(Menu.MAIN_MENU);
        String pointn = reader.readLine();
        int point = Integer.parseInt(pointn);
        Utils.eventProcessor(point -1, Menu.EVENT_TYPE_MAIN_MENU);//-1 для работы с массива т.к. в нем индкс начинается с нуля, а у нас с единицы!!!


    }


}
