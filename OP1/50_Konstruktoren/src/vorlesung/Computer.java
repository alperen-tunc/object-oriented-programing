package vorlesung;

public class Computer
{
    private int speicherplatz;
    private String besitzer;

    public int getSpeicherplatz()
    {
        return speicherplatz;
    }

    public void setSpeicherplatz(int speicherplatz)
    {
        this.speicherplatz = speicherplatz;
    }

    public String getBesitzer()
    {
        return besitzer;
    }

    public void setBesitzer(String besitzer)
    {
        this.besitzer = besitzer;
    }

    // Möchte ich bei der Objekterstellung bereits Werte an die Attribute zuweisen, so kann ich dazu eigene Konstruktoren verwenden.
    // Konstruktoren heißen in Java exakt so wie die Klasse. Sie sind in der Regel "public" (aber auch private ist möglich).
    // Konstruktoren haben KEINEN Rückgabetyp (auch nicht void!)
    // Konstruktoren können Parameter haben und folgen damit den Regeln der Methodenüberladung.
    // 1. eigenen Konstruktor: erwartet nur einen Übergabewert 'int speicherplatz'
    public Computer(int speicherplatz)
    {
        this.speicherplatz = speicherplatz;
    }

    /*public Computer(int s) // -> Fehlermeldung: Es gibt bereits einen Konstruktor in der Form Computer(int)
    {

    }*/

    // Methodenüberladung! Gleicher Name, andere Parametertypen.
    // 2. eigener Konstruktor: erwartet nur den Übergabewert 'string besitzer'
    public Computer(String besitzer)
    {
        this.besitzer = besitzer;
    }

    // 3. eigener Konstruktor: erwartet 'int speicherplatz' UND 'string besitzer'
    public Computer(int speicherplatz, String besitzer)
    {
        this.speicherplatz = speicherplatz;
        this.besitzer = besitzer;
    }

    // Für eine gültige Methodenüberladung reicht auch schon eine andere Reihenfolge der Parameter-Typen:
    // (dieser Konstruktor dient hier nur der Veranschaulichung der Methodenüberladung und der Konstruktor-Verkettung)
    public Computer(String b, int s)
    {
        this(s, b); // -> Mit this() kann ein anderer Konstruktor dieser Klasse aufgerufen werden.
        // Dadurch wird doppelter Code vermieden, denn die Zuweisung muss nur in einem Konstruktor erfolgen (Konstruktor-Verkettung oder Konstruktor-Weiterleitung)
        // Konstruktor-Verkettung muss der erste Befehl des Konstruktors sein.

        //this.besitzer = besitzer;
        //this.speicherplatz = speicherplatz;
    }

}
