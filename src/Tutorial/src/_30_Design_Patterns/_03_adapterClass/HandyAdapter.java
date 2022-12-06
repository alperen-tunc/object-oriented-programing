package Tutorial.src._30_Design_Patterns._03_adapterClass;

public class HandyAdapter implements ElektrischeHausGeräte
{
    private Handy handy;

    public HandyAdapter(Handy handy)
    {
        this.handy = handy;
    }

    @Override
    public int steckdoseEinstecken()
    {
        return handy.aufladen();
    }
}
