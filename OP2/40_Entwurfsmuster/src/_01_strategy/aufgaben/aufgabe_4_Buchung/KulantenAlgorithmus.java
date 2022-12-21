package _01_strategy.aufgaben.aufgabe_4_Buchung;

public class KulantenAlgorithmus implements IStornoAlgorithmus
{
    public double berechneStorno(Reise reise)
    {
        return reise.bestimmeTage() > 1 ? reise.berechnePreis() * 0.25 : reise.berechnePreis() * 0.5;
    }
}
