package vorlesung;

import java.util.LinkedList;

public class Kurs
{
    // Diese Liste soll alle erzeugten Kurse speichern.
    public static final LinkedList<Kurs> kursListe = new LinkedList<>();

    private String kursbezeichnung;

    public String getKursbezeichnung()
    {
        return kursbezeichnung;
    }

    public void setKursbezeichnung(String kursbezeichnung)
    {
        this.kursbezeichnung = kursbezeichnung;
    }

    // Zwei Konstruktoren: Einer, wenn noch keine Bezeichnung bekannt ist und einer wenn doch. Beide Konstruktoren sollen die Bezeichnung zuweisen UND das Objekt der Liste hinzufügen.
    // → Dazu können wir die Konstruktor-Verkettung nutzen!
    public Kurs()
    {
        this("Keine Bezeichnung"); // Konstruktor-Verkettung mit 'this()' → Dies ist ein Methodenaufruf, genau genommen wird hier der zweite Konstruktor aufgerufen.
        System.out.println("Aufruf des parameterlosen Konstruktors.");
        //this.kursbezeichnung = "Keine Bezeichnung"; // Da der andere Konstruktor bereits eine Initialisierung der Attribute vornimmt, kann man sich das hier sparen!
        //kursListe.add(this);
    }

    public Kurs(String kursbezeichnung)
    {
        this.kursbezeichnung = kursbezeichnung;
        System.out.println("Aufruf des Konstruktors mit Parameter.");
        kursListe.add(this); // 'this' verweist (enthält die Adresse) auf das Objekt, welches in der Main mit 'new Kurs()' erzeugt wird.
    }
}
