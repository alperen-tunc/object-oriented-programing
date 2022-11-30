package op2.t04_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.versandstrategien;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.Bestellung;

public class UPSVersand implements VersandStrategie {
  
  @Override
  public double berechneVersandkosten( Bestellung bestellung ) {
    // bestellung -> Abmessung/Gewicht der einzelnen Pakete auslesen
    // und darauf hin die Versandkosten berechnen
    return 4.00d;
  }
  
}
