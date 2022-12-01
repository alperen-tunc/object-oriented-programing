package _01_strategy.aufgaben.aufgabe_1_versandkosten._01Nachher;

import _01_strategy.aufgaben.aufgabe_1_versandkosten._01Nachher.Operation.Versandoption1;
import _01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Adresse;

public class Bestellung1
{
    private Adresse adresse;

    public Bestellung1(Adresse adresse)
    {
        this.adresse = adresse;
    }

    public Adresse getAdresse()
    {
        return adresse;
    }

    public void setAdresse(Adresse adresse)
    {
        this.adresse = adresse;
    }
}
