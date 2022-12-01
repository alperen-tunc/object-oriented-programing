package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen;

public class Multiplikation implements OperationWaehlen
{
    @Override
    public double berechnen(double a, double b)
    {
        System.out.println("Multiplikation: ");
        return (a*b);
    }
}
