package _01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.versandstrategien;


import _01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher.Bestellung;

public class DHLVersand implements VersandStrategie {
  
  @Override
  public double berechneVersandkosten( Bestellung bestellung ) {
    return 3.50d;
  }
  
}
