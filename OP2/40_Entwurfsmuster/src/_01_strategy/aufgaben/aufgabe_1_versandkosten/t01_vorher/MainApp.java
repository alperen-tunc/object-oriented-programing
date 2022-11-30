package _01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher;


import _01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Adresse;
import _01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Versandoption;

public class MainApp {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    Adresse zielort = new Adresse("Hendrick", "Zuhause 12", "Dortmund", "12345", "GER");
    Bestellung bestellung = new Bestellung(zielort, Versandoption.HERMES);
		// =============================================================================
    VersandkostenBerechnungsService service = new VersandkostenBerechnungsService();
    double versandkosten = service.berechneVersandkosten(bestellung);
    System.out.println(versandkosten);
    System.out.println("======================= end of main() ======================");
  }
  
}
