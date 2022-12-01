package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen;

import _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Meinmain;
import _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen.OperationWaehlen;

public class ExceptionClass implements OperationWaehlen
{
    @Override
    public double berechnen(double a, double b)
    {
        return -999999999;
    }

    public ExceptionClass()
    {
        System.err.println("Bitte geben Sie richtige Rechenart ein.");
    }
}
