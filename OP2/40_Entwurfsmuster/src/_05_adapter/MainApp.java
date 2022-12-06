package _05_adapter;

public class MainApp
{
    public static void main(String[] args)
    {
        Ente ente = new MoorEnte();
        entenTest(ente);

        Truthahn truthahn = new WildTruthahn();
        Ente truthahnAdapter = new TruthahnAdapter(truthahn);

        entenTest(truthahnAdapter);

        System.out.println("\n\nEnd of Main..");
    }

    static void entenTest(Ente ente)
    {
        ente.fliegen();
        ente.quaken();
    }
}
