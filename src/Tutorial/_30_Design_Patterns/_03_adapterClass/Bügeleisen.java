package Tutorial._30_Design_Patterns._03_adapterClass;

public class Bügeleisen implements ElektrischeHausGeräte
{
    private int volt;

    public Bügeleisen(int volt)
    {
        this.volt = volt;
    }
    @Override
    public int steckdoseEinstecken()
    {
        System.out.println(getClass().getSimpleName() + " wird gestartet..");
        return volt;
    }
}
