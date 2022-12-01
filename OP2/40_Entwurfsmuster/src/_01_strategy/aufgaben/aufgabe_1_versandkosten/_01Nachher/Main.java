package _01_strategy.aufgaben.aufgabe_1_versandkosten._01Nachher;

import _01_strategy.aufgaben.aufgabe_1_versandkosten._01Nachher.Operation.DHL;
import _01_strategy.aufgaben.aufgabe_1_versandkosten._01Nachher.Operation.Versandoption1;
import _01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Adresse;

public class Main
{
    public static void main(String[] args)
    {
        Adresse meinAdresse = new Adresse("Alperen", "Neue Strasse", "Wuppertal", "42280", "Germany");
        KostenBerechnung meinKonsten = new KostenBerechnung();
        Bestellung1 erste = new Bestellung1(meinAdresse);
        meinKonsten.setOption(new DHL());
        System.out.println(meinKonsten.getKosten());




        System.out.println("\n\nEnd of MainApp..");
    }
}
