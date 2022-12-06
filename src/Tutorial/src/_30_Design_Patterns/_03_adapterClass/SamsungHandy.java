package Tutorial.src._30_Design_Patterns._03_adapterClass;

public class SamsungHandy implements Handy
{
    private int aufladeVolt;

    public SamsungHandy(int aufladeVolt)
    {
        this.aufladeVolt = aufladeVolt;
    }

    @Override
    public int aufladen()
    {
        System.out.println(getClass().getSimpleName() + " wird aufgeladen");
        return aufladeVolt;
    }
}
