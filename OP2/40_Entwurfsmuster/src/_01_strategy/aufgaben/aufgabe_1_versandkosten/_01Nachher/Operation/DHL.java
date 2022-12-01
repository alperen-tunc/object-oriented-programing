package _01_strategy.aufgaben.aufgabe_1_versandkosten._01Nachher.Operation;

public class DHL implements Versandoption1
{
    @Override
    public double berechneKosten()
    {
        return 3.50d;
    }
}
