package _01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.versandstrategien;

import _01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher.Bestellung1;
import _01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.Bestellung;

public interface VersandStrategie {
  
  double berechneVersandkosten( Bestellung bestellung);

}
