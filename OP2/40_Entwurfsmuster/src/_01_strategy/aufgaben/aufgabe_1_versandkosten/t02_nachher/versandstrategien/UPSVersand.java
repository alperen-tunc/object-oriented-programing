package _01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.versandstrategien;


import _01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher.Bestellung;

public class UPSVersand implements VersandStrategie {
  
  @Override
  public double berechneVersandkosten( Bestellung bestellung ) {
    // bestellung -> Abmessung/Gewicht der einzelnen Pakete auslesen
    // und darauf hin die Versandkosten berechnen
    return 4.00d;
  }
  
}
