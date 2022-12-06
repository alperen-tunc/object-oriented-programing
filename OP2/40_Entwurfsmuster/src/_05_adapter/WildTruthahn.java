package _05_adapter;

public class WildTruthahn implements Truthahn
{
    @Override
    public void kollern()
    {
        System.out.println("Kollern");
    }

    @Override
    public void fliegen()
    {
        System.out.println("Fliegen");
    }
}
