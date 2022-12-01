package _01_strategy.aufgaben.aufgabe_1_versandkosten._01Nachher;

import _01_strategy.aufgaben.aufgabe_1_versandkosten._01Nachher.Operation.Versandoption1;

public class KostenBerechnung
{
    private Versandoption1 option;

    public void setOption(Versandoption1 versandoption1)
    {
        this.option = versandoption1;
    }

    public double getKosten()
    {
        return option.berechneKosten();
    }
}
