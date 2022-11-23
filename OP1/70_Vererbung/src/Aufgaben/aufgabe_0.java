package Aufgaben;

/* Aufgabe 0 (Basics)
 * Erstellen Sie die Klasse "Künstler" mit dem privaten Attribut "name".
 * Erstellen Sie zwei weitere Klassen "Maler" und "Sänger", die beide von "Künstler" erben.
 * Die beiden Subklassen erhalten keine weiteren Attribute.
 * Für jede Klasse implementieren Sie einen Konstruktor. Das Attribut "name" soll im Code nur ein einziges Mal zugewiesen werden.
 * Außerdem soll der Konstruktor bei Künstler '"Ein Künstler mit dem Namen "+ name' ausgeben, der Konstruktor
 * von Maler "Ich bin ein Maler" und der von Sänger "Ich bin ein Sänger".
 * In der main Methode erzeugen Sie mit dem passenden parametrisierten Konstruktor je ein Objekt von Maler und Sänger.
 */
class Künstler
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Künstler(String name)
    {
        this.name = name;
    }

    public void ausgabe()
    {
        System.out.println("Ein Künstler mit dem Namen: " + name);
    }
}

class Maler extends Künstler
{
    public Maler(String name)
    {
        super(name);
    }

    @Override
    public void ausgabe()
    {
        super.ausgabe();
        System.out.println("Ich bin ein Maler.");
    }
}

class Sänger extends Künstler
{
    public Sänger(String name)
    {
        super(name);
    }

    @Override
    public void ausgabe()
    {
        super.ausgabe();
        System.out.println("Ich bin ein Sänger");
    }
}

public class aufgabe_0
{
    public static void main(String[] args)
    {
        Sänger sänger = new Sänger("Taylor Swift");

        Künstler maler = new Maler("Vincent Van Gogh");

        sänger.ausgabe();

        System.out.println();

        maler.ausgabe();
    }
}
