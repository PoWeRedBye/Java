package BookStorage.com.company.event.impl;

import BookStorage.com.company.db.MemD8;
import BookStorage.com.company.entity.Book;
import BookStorage.com.company.event.Event;

/**
 * Создание Сингл-Тона!!! С привытным конструктором.
 */
public class AllBookEvent implements Event {
    private static AllBookEvent instance;

    public static AllBookEvent getInstance() {
        if (instance == null) instance = new AllBookEvent();
        return instance;
    }

    public void doSomething() {
        for (Book book:MemD8.books){
            System.out.println(book);

        }
    }

    private AllBookEvent() {

    }
}
