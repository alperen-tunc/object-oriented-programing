package _01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.versandstrategien;

import _01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher.Bestellung1;
import _01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.Bestellung;

public class HermesVersand implements VersandStrategie {
  
  @Override
  public double berechneVersandkosten( Bestellung bestellung ) {
    return 2.95d;
  }
  
}
