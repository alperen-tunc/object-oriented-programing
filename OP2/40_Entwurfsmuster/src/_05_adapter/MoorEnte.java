package _05_adapter;

public class MoorEnte implements Ente
{

    @Override
    public void quaken()
    {
        System.out.println("quaken...");
    }

    @Override
    public void fliegen()
    {
        System.out.println("Fliegen");
    }
}
