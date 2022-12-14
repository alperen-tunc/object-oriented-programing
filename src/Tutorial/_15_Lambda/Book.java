package Tutorial._15_Lambda;

import java.util.SplittableRandom;

public class Book
{
    private double price;
    private String name;

    public Book (double price, String name)
    {
        super();
        this.price = price;
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
