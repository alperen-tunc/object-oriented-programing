package Tutorial._30_Design_Patterns._03_adapterClass;

public class Kühlschrank implements ElektrischeHausGeräte
{
    private int volt;

    public Kühlschrank(int volt)
    {
        this.volt = volt;
    }

    @Override
    public int steckdoseEinstecken()
    {
        System.out.println(getClass().getSimpleName() + " wird gestartet...");
        return volt;
    }
}
