package Tutorial._30_Design_Patterns._07_state;

public class Spiel
{
    private Konsole konsole;

    public Spiel()
    {
        System.out.println("Game Beginn..");
        konsole = new Attack();
    }

    public void dreieck()
    {
        konsole.dreieckDrücken();
    }

    public void rechteck()
    {
        konsole.rechteckdrücken();
    }

    public void kreis()
    {
        konsole.kreisDrücken();
    }

    public void x()
    {
        konsole.xDrücken();
    }

    public void takeBall()
    {
        System.out.println("Nimm die das Ball und attack");
        konsole = new Attack();
    }

    public void getBall()
    {
        System.out.println("Komm Defence...");
        konsole = new Defence();
    }

}
