package vorlesung.lebewesen;

public class Hauskatze extends Katze
{
    public Hauskatze(int alter)
    {
        super(alter);
    }

    @Override
    public final void ausgabe() // 'final' bei einer Methode verhindert das Überschreiben in abgeleiteten Klassen.
    {
        super.ausgabe();
        System.out.println("Ich bin eine Hauskatze. Miau");
    }
}
