package Tutorial.src._30_Design_Patterns._07_state;

public class Defence implements Konsole
{
    @Override
    public void dreieckDrücken()
    {
        System.out.println("Kaleci acilsin..");
    }

    @Override
    public void rechteckdrücken()
    {
        System.out.println("Müdahale ediliyor..");
    }

    @Override
    public void kreisDrücken()
    {
        System.out.println("Kayarak müdahale...");
    }

    @Override
    public void xDrücken()
    {
        System.out.println("Markaja al..");
    }
}
