package BookStorage.com.company.event.impl;

import BookStorage.com.company.event.Event;

/**
 * Created by Maxim_Ozarovskiy on 21.12.2016.
 */
public class BookToBookEvent implements Event {
    private static BookToBookEvent instance;

    public static BookToBookEvent getInstance() {
        if (instance == null) instance = new BookToBookEvent();
        return instance;
    }



    public void doSomething() {


    }

    private BookToBookEvent() {

    }
}
