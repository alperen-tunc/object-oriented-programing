package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen;

public class Subtraktion implements OperationWaehlen
{

    @Override
    public double berechnen(double a, double b)
    {
        System.out.println("Subtraktion: ");
        return (a-b);
    }
}
