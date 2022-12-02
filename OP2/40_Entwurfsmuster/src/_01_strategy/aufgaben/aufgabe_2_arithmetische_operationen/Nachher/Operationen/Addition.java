package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen;

public class Addition implements Operation
{
    @Override
    public double berechnen(double a, double b)
    {
        System.out.print("Addition: " );
        return (a+b);
    }
}
