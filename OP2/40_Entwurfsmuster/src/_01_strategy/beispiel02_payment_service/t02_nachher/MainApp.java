package op2.t04_entwurfsmuster.t01_strategy.beispiel02_payment_service.t02_nachher;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel02_payment_service.t02_nachher.bezahl_strategien.BezahlenMitKreditkarte;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel02_payment_service.t02_nachher.bezahl_strategien.BezahlenMitPayPal;

public class MainApp {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    BezahlService bezahlService = new BezahlService();
    // =============================================================================
    bezahlService.setStrategie( new BezahlenMitKreditkarte() );
    bezahlService.bezahlungEinleiten(178);
    System.out.println("============================================================");
    bezahlService.setStrategie( new BezahlenMitPayPal() );
    bezahlService.bezahlungEinleiten(178);
    System.out.println("======================= end of main() ======================");
  }
  
}
