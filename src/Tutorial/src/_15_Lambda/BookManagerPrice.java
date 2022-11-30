package _15_Lambda;

public class BookManagerPrice implements BookManager
{
    @Override
    public double manage(Book b1, Book b2)
    {
        return b1.getPrice() + b2.getPrice();
    }
}
