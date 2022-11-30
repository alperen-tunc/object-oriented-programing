package op2.t04_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Adresse;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Versandoption;

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
