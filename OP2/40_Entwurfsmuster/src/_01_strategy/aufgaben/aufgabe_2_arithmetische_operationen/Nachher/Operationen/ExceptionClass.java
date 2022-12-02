package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen;

public class ExceptionClass implements Operation
{
    @Override
    public double berechnen(double a, double b)
    {
        System.out.println("Geben Sie bitte gültige Syntax ein: ");
        return -999999999;
    }

    public ExceptionClass()
    {
        System.err.println("Bitte geben Sie richtige Rechenart ein.");
    }
}
