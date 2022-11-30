package _01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher;

import _01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Adresse;
import _01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher.Bestellung;
import _01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher.VersandkostenBerechnungsService;
import _01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.versandstrategien.HermesVersand;

public class MainApp {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    Adresse zielort = new Adresse("Hendrick", "Zuhause 12", "Dortmund", "12345", "GER");
    //Bestellung bestellung = new Bestellung(zielort);
    // =============================================================================
    VersandkostenBerechnungsService service = new VersandkostenBerechnungsService();
    //service.setStrategie(new HermesVersand());
    ///double versandkosten = service.berechneVersandkosten(bestellung);
    //System.out.println(versandkosten);
    
    System.out.println("======================= end of main() ======================");
  }
  
}
