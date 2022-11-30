package _01_strategy.beispiel02_payment_service.t02_nachher;


import _01_strategy.beispiel02_payment_service.t02_nachher.bezahl_strategien.BezahlenMitKreditkarte;
import _01_strategy.beispiel02_payment_service.t02_nachher.bezahl_strategien.BezahlenMitPayPal;

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
