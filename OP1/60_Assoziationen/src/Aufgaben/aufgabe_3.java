package Aufgaben;

import java.util.ArrayList;

/*
 * Zwei Klassen:
 * "Buch" mit dem Attribut "titel" (public get)
 * "Autor" mit dem Attribut "name" (public get)
 * jeweils einen Konstruktor, der die Eigenschaften initialisiert.
 * Implementieren Sie die Assoziation der beiden Klassen und stellen Sie eine bidirektionale Navigierbarkeit her.
 * Dazu müssen Sie den Klassen weitere Member hinzufügen.
 * (Gehen Sie davon aus, dass ein Buch mehrere Autoren haben und ein Autor mehrere Bücher verfassen kann)
 * Testen Sie das Programm im Main.
 */
class Buch
{
    private String titel;

    private ArrayList<Autor> autors = new ArrayList<>();

    public ArrayList<Autor> getAutors()
    {
        return autors;
    }

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public Buch(String titel)
    {
        this.titel = titel;
    }

    public void addAutors(Autor autor)
    {
        autors.add(autor);
    }
}

class Autor
{
    private String name;

    private ArrayList<Buch> buches = new ArrayList<>();

    public ArrayList<Buch> getBuches()
    {
        return buches;
    }

    public void setBuches()
    {
        buches = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Autor(String name)
    {
        this.name = name;
        setBuches();
    }
    public void addBuches(Buch buch)
    {
        buches.add(buch);
    }

}

public class aufgabe_3
{
    public static void main(String[] args)
    {
        Autor a1 = new Autor("Tolstoy");
        a1.addBuches(new Buch("Krieg und Frieden"));
        a1.addBuches(new Buch("Anne Karenina"));

        for (int i=0; i<a1.getBuches().size(); i++)
            System.out.println(a1.getName() + " " + a1.getBuches().get(i).getTitel());

        Buch b1 = new Buch("erste");
        b1.addAutors(new Autor("Henry"));
        b1.addAutors(new Autor("Hans"));

        for (int i=0; i<b1.getAutors().size(); i++)
        {
            System.out.println(b1.getTitel() + " " + b1.getAutors().get(i).getName());
        }

        for (Buch a: a1.getBuches())
        {
            System.out.println(a.getTitel());
        }
    }
}
