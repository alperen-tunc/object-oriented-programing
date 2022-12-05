package _04_factory.aufgaben.aufgabe_1;

import java.util.HashMap;
import java.util.Map;

public class BookFactory
{
    public static BookService getInstance(String book)
    {
        BookService bookService = null;

        if (book.equalsIgnoreCase("file"))
        {
            bookService = new FileBookService();
        }
        else if (book.equalsIgnoreCase("database"))
        {
            bookService = new DatabaseBookService();
        }

        return bookService;
    }

    private Map<String, BookService> serviceMap;

    public BookFactory()
    {
        this.serviceMap = new HashMap<>();
        serviceMap.put("file", new FileBookService());
        serviceMap.put("database", new DatabaseBookService());
    }

    public BookService getService(String service)
    {
        BookService bookService = serviceMap.get(service);
        if (bookService == null)
        {
            return null;
        }
        return bookService;
    }
}
