package vorlesung;

// Wird von einer abstrakten Klasse mit abstrakten Methoden geerbt, ist man dazu gezwungen, diese abstrakten Methoden in der abgeleiteten Klasse zu überschreiben.
public class Leistenkrokodil extends Krokodil
{
    public Leistenkrokodil(String farbe)
    {
        // 'farbe' an protected Konstruktor der Superklasse weiterreichen.
        super(farbe);
    }

    // Abstrakte Methoden MÜSSEN in nicht-abstrakten Klassen überschrieben werden.
    @Override
    public void zeigeInfoZumLebensraum()
    {
        System.out.println("Ich lebe in Ostindien, Südostasien und komme sogar bis nach Nordaustralien.");
    }

    // Die Subklasse kann natürlich auch eigene Member besitzen:
    public void imSchlammLiegen()
    {
        System.out.println("Ich liege im Schlamm. Hier mag ich es.");
    }

}
