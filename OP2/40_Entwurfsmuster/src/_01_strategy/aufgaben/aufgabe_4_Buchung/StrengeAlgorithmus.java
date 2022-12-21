package _01_strategy.aufgaben.aufgabe_4_Buchung;

import java.time.LocalDate;

public class StrengeAlgorithmus implements IStornoAlgorithmus
{

    public double berechneStorno(Reise reise)
    {
        return reise.bestimmeTage() > 10 ? reise.berechnePreis() * 0.25 : reise.berechnePreis() * 0.75;
    }
}
