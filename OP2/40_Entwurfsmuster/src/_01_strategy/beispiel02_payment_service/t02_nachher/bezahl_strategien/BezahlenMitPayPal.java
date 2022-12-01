package _01_strategy.beispiel02_payment_service.t02_nachher.bezahl_strategien;

public class BezahlenMitPayPal implements BezahlStrategie
{
  private String email;
  private String passwort;
  
  @Override
  public void bezahlen( int betrag )
  {
    System.out.println("Bezahlen von " + betrag + " mit PayPal");
  
  }
  
}
