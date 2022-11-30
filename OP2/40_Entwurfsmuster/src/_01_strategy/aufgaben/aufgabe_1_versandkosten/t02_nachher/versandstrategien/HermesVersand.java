package op2.t04_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.versandstrategien;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.Bestellung;

public class HermesVersand implements VersandStrategie {
  
  @Override
  public double berechneVersandkosten( Bestellung bestellung ) {
    return 2.95d;
  }
  
}
