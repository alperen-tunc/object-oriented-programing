package _01_strategy.aufgaben.aufgabe_4_Buchung;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Reise
{
    protected double grundPreis;
    private final LocalDateTime reiseBeginn;
    protected IStornoAlgorithmus stornoAlgorithmus;

    public Reise(LocalDateTime reiseBeginn, double grundPreis)
    {
        this.reiseBeginn = reiseBeginn;
        this.grundPreis = grundPreis;
    }

    /**
     * Ermittelt die Anzahl Tage bis zum Reisebeginn.
     */
    public int bestimmeTage()
    {
        return (int)Duration.between(LocalDateTime.now(), reiseBeginn).toDays();
    }

    /**
     * Kalkuliert mit unterschiedlichen Algorithmen den Preis der Reise.
     */
    public abstract double berechnePreis();

    /**
     * Setzt den Storno Algorithmus.
     */
    public void setStornoAlgorithmus(IStornoAlgorithmus stornoAlgorithmus)
    {
        this.stornoAlgorithmus = stornoAlgorithmus;
    }

    /**
     * Berechnet die Stornogebühren und gibt diese zurück.
     */
    public double berechneStorno()
    {
        return stornoAlgorithmus.berechneStorno(this);
    }

}
