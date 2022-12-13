package Aufgaben.aufgabe_3;


import java.util.ArrayList;
import java.util.List;

public class BookService
{
    private List<Buch> bookList = new ArrayList<>();
    private int nextId = 1;

    public void save(Buch buch)
    {
        buch.setId(nextId);
        bookList.add(buch);
        nextId++;
    }

    public List<Buch> getBookList()
    {
        return bookList;
    }

    public  Buch getBuchById(int id)
    {
        return null;
    }
}
