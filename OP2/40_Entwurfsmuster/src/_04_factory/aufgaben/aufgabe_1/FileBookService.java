package _04_factory.aufgaben.aufgabe_1;

public class FileBookService implements BookService
{
    @Override
    public void save(Book book)
    {
        System.out.println(book.getName() + " wird in FileBookService gespeichert...");
    }

    @Override
    public void read(Book book)
    {
        System.out.println(book.getName() + " wird in FileBookService gelesen...");
    }

    @Override
    public void updated(Book book)
    {
        System.out.println(book.getName() + " wird in FileBookService updated...");
    }

    @Override
    public void delete(Book book)
    {
        System.out.println(book.getName() + " wird in FileBookService gelöscht...");
    }
}
