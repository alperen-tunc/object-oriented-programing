package _01_strategy.aufgaben.aufgabe_4_Buchung;

import java.time.LocalDateTime;

class GoldReise extends Reise
{
    // Bei GoldReisen kommt der kulante Stornoalgorithmus zum Einsatz
    public GoldReise(LocalDateTime reiseBeginn, double grundPreis)
    {
        super(reiseBeginn, grundPreis);
        this.stornoAlgorithmus = new KulantenAlgorithmus();
    }

    @Override
    public double berechnePreis()
    {
        return grundPreis * 1.75;
    }
}
