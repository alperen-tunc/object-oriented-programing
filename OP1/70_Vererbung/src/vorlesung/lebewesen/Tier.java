package vorlesung.lebewesen; // Eigenes Paket für die Klassen, um das Konzept 'protected' besser zeigen zu können.

import java.util.ArrayList;

// Beispiel für Vererbung anhand der Klassen Tier, Hund und Dackel:
public class Tier // Superklasse (Basisklasse, Elternklasse)
{
    // Eine statische Liste, um alle Tiere zu speichern. Dank Polymorphie können dort auch die Subklassen gespeichert werden.
    public static final ArrayList<Tier> tierListe = new ArrayList<>();

    // Alle Tiere haben ein Alter.
    private int alter;

    // Ich möchte von der Klasse 'Tier' keine Objekte erzeugen können, aber der Konstruktor soll trotzdem für die Subklassen aufrufbar sein.
    // Zur Lösung können wir den Konstruktor 'protected' machen.
    // Zu den Zugriffs-Modifizierer: https://www.geeksforgeeks.org/access-modifiers-java/
    // ACHTUNG: 'protected' Member wirken innerhalb desselben Packages wie 'public'!
    protected Tier(int alter)
    {
        System.out.println("Aufruf des Konstruktors in Tier.");
        this.alter = alter;
        tierListe.add(this);
    }

    public int getAlter()
    {
        return alter;
    }

    public void ausgabe()
    {
        System.out.println("Ich bin ein Tier.");
    }
}
