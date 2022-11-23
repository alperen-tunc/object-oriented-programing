package vorlesung.lebewesen;

public class Katze extends Tier
{
    public Katze(int alter)
    {
        super(alter);
    }

    @Override
    public void ausgabe()
    {
        super.ausgabe();
        System.out.println("Ich bin eine Katze. Miau");
    }
}
