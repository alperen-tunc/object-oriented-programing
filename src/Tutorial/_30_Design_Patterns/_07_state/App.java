package Tutorial._30_Design_Patterns._07_state;

public class App
{
    public static void main(String[] args)
    {
        Spiel spiel = new Spiel();

        spiel.x();
        spiel.dreieck();
        spiel.kreis();
        spiel.getBall();

        spiel.x();
        spiel.dreieck();
        spiel.kreis();
        spiel.takeBall();

        System.out.println("\n\nEnd of Main..");
    }
}
