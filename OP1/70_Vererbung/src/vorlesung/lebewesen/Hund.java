package vorlesung.lebewesen;

// Englischer Begriff: Inheritance
// Hund ist die Subklasse von Tier, bedeutet: Hund IST EIN Tier.
// Syntax zur Vererbung:
// class Subklasse extends Superklasse
public class Hund extends Tier // Hund erweitert Tier
{
    private String fellfarbe;

    // Reihenfolge und Bezeichnung der Parameter beliebig, sinnvoll ist aber, die Parameter wie die Attribute zu benennen, den Parameter des Superklassen-Konstruktors zuerst aufzulisten und danach alle zusätzlichen Attribute.
    public Hund(int alter, String fellfarbe)
    {
        // Um 'alter' kümmert sich die Superklasse.
        super(alter);
        // Bei Vererbung sind wir gezwungen, die Konstruktoren zu verketten. Wird ein Objekt einer Subklasse erzeugt, MUSS immer auch der Konstruktor der Superklasse aufgerufen werden.
        // Bei Konstruktoren ohne Parameter (z.B. der Default-Konstruktor) geschieht dies automatisch, bei Konstruktoren mit Parameter müssen wir es manuell machen.
        // Der Aufruf des Superklassen-Konstruktors muss der erste Befehl sein.

        System.out.println("Aufruf des Konstruktors in Hund.");

        this.fellfarbe = fellfarbe;
    }

    public String getFellfarbe()
    {
        return fellfarbe;
    }

    // Die @Override-Annotation in Java teilt dem Compiler mit, dass eine Methode der Superklasse überschrieben werden soll. Es ist nicht zwingend anzugeben, es ist aber empfehlenswert, damit wir selbst Fehler vermeiden und damit zur Dokumentation des Codes deutlich ist, dass das Überschreiben beabsichtigt ist.
    // Wir überschreiben die Methode und ändern damit ihr Verhalten.
    @Override
    public void ausgabe()
    {
        super.ausgabe(); // Wir können das Verhalten der originalen Methode in diese einbinden.
        System.out.println("Ich bin ein Hund. Wau Wau");
    }
}
