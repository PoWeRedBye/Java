package BookStorage.com.company;

import BookStorage.com.company.event.Event;
import BookStorage.com.company.event.EventType;
import BookStorage.com.company.event.impl.AllBookEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Создание меню для Библиотеки!!!!
 */
public class Menu {
    public static final String[] MAIN_MENU = {
            "1: Все книги",
            "2: Зарезервировать книгу",
            "3: Снять резервацию",
            "*: Выход",
    };

    public static final String[] WRITE_BOOK = {
            "1: Выберите книгу",
            "2: Выход",
    };

    public static final String[] BOOK_TO_BOOK = {
            "1: Выберите книгу для резервации",
            "2: Выход",
    };

    public static final String[] CANCEL_BOOK = {
            "1: Выберите книгу для отмены резервации",
            "2: Выход",
    };
    public static Map<EventType, Event> eventMap = new HashMap<EventType, Event>();

    public static final List<EventType> EVENT_TYPE_MAIN_MENU =  new ArrayList<EventType>();
    public static final List<EventType> BOOK_TO_BOOK_MAIN_MENU =  new ArrayList<EventType>();

    static {
        initAllEventMap();
        initMainMenuEventType();
    }

    private static void initAllEventMap() {
        eventMap.put(EventType.WRITE_ALL_BOOK, AllBookEvent.getInstance());
      //  eventMap.put(BOOK_TO_BOOK, BookToBookEvent.getInstance());
    }

    private static void initMainMenuEventType() {
        EVENT_TYPE_MAIN_MENU.add(EventType.WRITE_ALL_BOOK);
        EVENT_TYPE_MAIN_MENU.add(EventType.BOOK_TO_BOOK);
    }
    private static void initBookToBookMenuEventTypes(){
        //EVENT_TYPE_BOOK_TO_BOOK_MENU.add(EventType.BOOK_TO_BOOK);

    }

}
