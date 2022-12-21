package _01_strategy.aufgaben.aufgabe_4_Buchung;


import java.time.LocalDateTime;

class BronzeReise extends Reise
{
    // Bei BronzeReisen kommt der strenge Stornoalgorithmus zum Einsatz (bei Stammkunden kann der Algorithmus auf den kulanten Stornoalgorithmus gesetzt werden)
    public BronzeReise(LocalDateTime reiseBeginn, double grundPreis)
    {
        super(reiseBeginn, grundPreis);
        this.stornoAlgorithmus = new StrengeAlgorithmus();
    }

    @Override
    public double berechnePreis()
    {
        return grundPreis * 1.25;
    }
}
