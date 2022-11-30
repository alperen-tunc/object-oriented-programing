package _15_Lambda;

public class BookStore
{
    private BookManager manager;

    public BookManager getManager()
    {
        return manager;
    }

    public BookStore(BookManager manager)
    {
        this.manager = manager;
    }

    public void setBookManager(BookManager manager)
    {
        this.manager = manager;
    }

}
