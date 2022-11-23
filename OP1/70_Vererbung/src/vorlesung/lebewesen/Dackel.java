package vorlesung.lebewesen;

// Dackel ist die Subklasse von Hund und da Hund die Subklasse von Tier ist, ist Dackel auch eine Subklasse von Tier.
// Dackel IST ein Hund UND ein Tier.
// Mit dem 'final'-Keyword geben wir bei Klassen an, dass von dieser Klasse nicht weiter abgeleitet werden kann.
public final class Dackel extends Hund
{
    public Dackel(int alter, String fellfarbe)
    {
        super(alter, fellfarbe);

        System.out.println("Aufruf des Konstruktors in Dackel.");
    }

    @Override
    public void ausgabe()
    {
        super.ausgabe();
        System.out.println("Ich bin ein Dackel. Wau Wau");
    }
}

// Subklasse 'Grauhaardackel' kann nicht erstellt werden, da 'Dackel' als 'final' gekennzeichnet wurde.
/*
class Grauhaardackel extends Dackel
{
    public Grauhaardackel(int alter, String fellfarbe)
    {
        super(alter, fellfarbe);
    }
}*/
