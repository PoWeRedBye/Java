package BookStorage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.String;

/**
 * Created by Maxim_Ozarovskiy on 17.12.2016.
 */
public class Biblioteka {

    public static class Book {
        public String name;
        public String body;

        public Book(String name, String body) {
            this.name = name;
            this.body = body;
        }


    }

    public static void main(String[] args) throws Exception {
        ArrayList<Book> booksList = new ArrayList<>();
        booksList.add(new Book("Kniga1", "some text1"));
        booksList.add(new Book("Kniga2", "some text2"));
        booksList.add(new Book("Kniga3", "some text3"));
        booksList.add(new Book("Kniga4", "some text4"));
        booksList.add(new Book("Kniga5", "some text5"));
        booksList.add(new Book("Kniga6", "some text6"));
        booksList.add(new Book("Kniga7", "some text7"));
        booksList.add(new Book("Kniga8", "some text8"));
        booksList.add(new Book("Kniga9", "some text9"));
        booksList.add(new Book("Kniga10", "some text10"));

        System.out.println("Меню: ");
        System.out.println("Для вывода доступных книг на экран нажмите - 1");
        System.out.println("Для резерва интересующей вас книги нажмите - 2");
        System.out.println("Для возврата зарезервированной книги нажмите - 3");


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Пожалуйста, сделайте свой выбор: ");
        String sNumbern = reader.readLine();
        int n = Integer.parseInt(sNumbern);
        for (Book s : booksList) {
            //System.out.println(s.name + "   -   " + s.body);
            while (true) {
                switch (n) {
                    case 1:

                        while (true) {
                            System.out.println(s.name   );
                            System.out.println(booksList.get(n-1).body);
                            break;
                        }

                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                            }

                }
            }


        }

    }
//}
