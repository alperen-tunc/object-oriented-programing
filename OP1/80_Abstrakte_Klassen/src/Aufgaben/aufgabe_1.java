package Aufgaben;
/* Erstellen Sie die abstrakte Klasse "Kreatur" mit einem privaten Attribut "name", einer abstrakten Methode "angreifen" und einem Konstruktor, der name initialisiert.
 * Erstellen Sie zwei weitere Klassen "Ritter" und "Drache", die beide von "Kreatur" erben.
 * Die beiden Subklassen implementieren die Methode der Basisklasse.
 * Der Ritter nutzt sein Schwert, der Drache spuckt Feuer.
 * In main() erzeugen Sie je ein Objekt von Ritter und Drache.
 * Rufen Sie in der main-Methode() für beide Objekte die überschriebene angreifen()-Methode auf.
 */
abstract class Kreatur
{
    private String name;

    abstract void angreifen();

    public Kreatur(String name)
    {
        this.name = name;
    }
}

class Ritter extends Kreatur
{
    public Ritter(String name)
    {
        super(name);
    }

    @Override
    void angreifen()
    {
        System.out.println("Ich benutze mein Schwert.");
    }
}

class Drache extends Kreatur
{
    public Drache(String name)
    {
        super(name);
    }

    @Override
    void angreifen()
    {
        System.out.println("Ich spucke Feuer.");
    }
}
public class aufgabe_1
{
    public static void main(String[] args)
    {
        Kreatur ritter = new Ritter("johns");
        Drache drache = new Drache("Rot");

        drache.angreifen();
        ritter.angreifen();
    }
}
