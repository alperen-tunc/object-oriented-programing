package _15_Lambda;

public interface BookManager
{
    double manage (Book b1, Book b2);

    default void sayBookName(Book book)
    {
        System.out.println("Der Buchname lautet: " + book.getName());
    }
}
