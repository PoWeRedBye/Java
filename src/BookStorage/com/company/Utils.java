package BookStorage.com.company;

import BookStorage.com.company.db.MemD8;
import BookStorage.com.company.entity.Book;
import BookStorage.com.company.event.EventType;

import java.util.List;

/**
 * Заполнение листа Книг!!!
 */
public class Utils {
    public static void addMockBooks(){
        MemD8.books.add(new Book("Book1","bla bla bla1"));
        MemD8.books.add(new Book("Book2","bla bla bla2"));
        MemD8.books.add(new Book("Book3","bla bla bla3"));
        MemD8.books.add(new Book("Book4","bla bla bla4"));
        MemD8.books.add(new Book("Book5","bla bla bla5"));
        MemD8.books.add(new Book("Book6","bla bla bla6"));
        MemD8.books.add(new Book("Book7","bla bla bla7"));
        MemD8.books.add(new Book("Book8","bla bla bla8"));
        MemD8.books.add(new Book("Book9","bla bla bla9"));
        MemD8.books.add(new Book("Book10","bla bla bla10"));
    }
    public static void  renderMenu(String[] stringList){
        for(String s : stringList){
            System.out.println(s);
        }
    }
    public static void eventProcessor(int point, List<EventType> eventTypes){
        Menu.eventMap.get(eventTypes.get(point)).doSomething();//конструкция которая позволяет выводить большое кол-во эвентов без применения свич-кейсов!!!

    }
}
