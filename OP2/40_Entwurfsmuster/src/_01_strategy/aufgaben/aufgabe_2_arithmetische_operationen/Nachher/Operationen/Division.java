package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen;

public class Division implements OperationWaehlen
{
    @Override
    public double berechnen(double a, double b)
    {
        System.out.println("Division: ");
        return a / b;
    }
}
