package _00_Intro._02_Nacher;
// Nur eine Instanz aus dieser Klasse erlauben, damit der Client-code immer wieder auf dieselbe Bücherliste zugreifen kann.

import java.util.ArrayList;
import java.util.List;

public class BookService
{
    private final List<Book> bookList = new ArrayList<>();

    // =================== Singleton ===================
    private static BookService service = new BookService(); // wird nur 1x ausgeführt

    private BookService() { }

    public static BookService getInstance() {
        return service;
    }
    // =================================================
    public void test() {
        System.out.println("in BookService");
    }
}
