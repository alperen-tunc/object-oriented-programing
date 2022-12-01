package _01_strategy.aufgaben.aufgabe_1_versandkosten._01Nachher.Operation;

public class Hermes implements Versandoption1
{
    @Override
    public double berechneKosten()
    {
        return 2.95d;
    }
}
