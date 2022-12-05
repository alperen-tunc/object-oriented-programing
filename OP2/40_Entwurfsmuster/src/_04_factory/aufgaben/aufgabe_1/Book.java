package _04_factory.aufgaben.aufgabe_1;

import java.util.ArrayList;
import java.util.List;

public class Book
{
    public List<Book> books = new ArrayList<>();
    private String name;
    private String genre;

    public Book(String name, String genre)
    {
        this.name = name;
        this.genre = genre;
        books.add(this);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }
}
