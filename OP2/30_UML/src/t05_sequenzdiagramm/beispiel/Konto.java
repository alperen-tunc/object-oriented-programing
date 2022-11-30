package t05_sequenzdiagramm.beispiel;

public class Konto {
  
  private double kontoStand;
  
  public void einzahlen( double betrag) {
    // Check, ob Betrag zulässig ist?
    buchen(betrag);
  }
  
  private void buchen( double betrag ) {
    //kontoStand = kontoStand + betrag;
    kontoStand += betrag; // Alternative
  }
  
}
