package Tutorial.src._30_Design_Patterns._07_state;

public class Attack implements Konsole
{
    @Override
    public void dreieckDrücken()
    {
        System.out.println("Ara pas...");
    }

    @Override
    public void rechteckdrücken()
    {
        System.out.println("Sut....");
    }

    @Override
    public void kreisDrücken()
    {
        System.out.println("Orta ac");
    }

    @Override
    public void xDrücken()
    {
        System.out.println("pass..");
    }
}
