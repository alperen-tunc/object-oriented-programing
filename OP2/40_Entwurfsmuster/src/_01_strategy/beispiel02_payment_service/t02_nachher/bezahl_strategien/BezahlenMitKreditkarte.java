package op2.t04_entwurfsmuster.t01_strategy.beispiel02_payment_service.t02_nachher.bezahl_strategien;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel02_payment_service.CreditCard;

public class BezahlenMitKreditkarte implements BezahlStrategie {
  private CreditCard karte;
  
  public void setKarte( CreditCard karte ) {
    this.karte = karte;
  }
  
  @Override
  public void bezahlen( int betrag ) {
    // Algorithmus für Bezahlen mit Kreditkarte
    System.out.println("Bezahlen von " + betrag + " mit Kreditkarte");
  }
  
}
