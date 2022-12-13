package Aufgaben.aufgabe_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Buch
{
    private List<Buch> buches = new ArrayList<>();

    private int id;
    private String titel;
    private String author;
    private String ISBN;
    private String verlag;
    private String datum;

    public Buch(int id, String titel, String author, String ISBN, String verlag, String datum)
    {
        this.id = id;
        this.titel = titel;
        this.author = author;
        this.ISBN = ISBN;
        this.verlag = verlag;
        this.datum = datum;
    }

    public Buch(String titel, String author, String ISBN, String verlag, String datum)
    {
        id++;
        this.titel = titel;
        this.author = author;
        this.ISBN = ISBN;
        this.verlag = verlag;
        this.datum = datum;
        buches.add(this);
    }
    public Buch()
    {
        buches.add(this);
    }

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public String getVerlag()
    {
        return verlag;
    }

    public void setVerlag(String verlag)
    {
        this.verlag = verlag;
    }

    public String getDatum()
    {
        return datum;
    }

    public void setDatum(String datum)
    {
        this.datum = datum;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return String.format("(%d) -> %s - %s", id, author, titel);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof Buch buch))
        {
            return false;
        }
        return getId() == buch.getId();
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getId());
    }
}
