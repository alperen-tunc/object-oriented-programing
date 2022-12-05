package _04_factory.aufgaben.aufgabe_1;

public class App
{
    public static void main(String[] args)
    {
        Book book = new Book("Monte Kristo", "Abenteuer");
        BookService bookService;
        bookService = BookFactory.getInstance("file");
        bookService.read(book);

        BookFactory bookFactory = new BookFactory();
        bookFactory.getService("database").save(book);




        System.out.println("\n\nEnd of Main..");
    }
}
