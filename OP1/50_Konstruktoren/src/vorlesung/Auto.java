package vorlesung;

// Die Klasse "Auto"
// Wir werden jetzt dazu übergehen, jede Klasse in eine eigene Datei zu schreiben.
public class Auto
{
    // Innerhalb der Klasse befindet sich kein (eigener, expliziter) Konstruktor -> Der Standard-Konstruktor wird automatisch gestellt.

    private int anzahlTüren;

    public int getAnzahlTüren()
    {
        return anzahlTüren;
    }

    public void setAnzahlTüren(int anzahlTüren)
    {
        this.anzahlTüren = anzahlTüren;
    }
}
