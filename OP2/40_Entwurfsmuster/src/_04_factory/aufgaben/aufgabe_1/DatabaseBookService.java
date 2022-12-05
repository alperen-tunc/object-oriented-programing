package _04_factory.aufgaben.aufgabe_1;

public class DatabaseBookService implements BookService
{
    @Override
    public void save(Book book)
    {
        System.out.println(book.getName() + " wird in DatabaseBookService gespeichert...");
    }

    @Override
    public void read(Book book)
    {
        System.out.println(book.getName() + " wird in DatabaseBookService gelesen...");
    }

    @Override
    public void updated(Book book)
    {
        System.out.println(book.getName() + " wird in DatabaseBookService updated...");
    }

    @Override
    public void delete(Book book)
    {
        System.out.println(book.getName() + " wird in DatabaseBookService gelöscht...");
    }
}
