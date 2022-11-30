package _01_strategy.beispiel02_payment_service.t01_vorher;

public class MainApp {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    BezahlService bezahlService = new BezahlService();
    bezahlService.setKosten(145);
    bezahlService.bezahlungEinleiten("CreditCard");
    bezahlService.bezahlungEinleiten("PayPal");
    System.out.println("======================= end of main() ======================");
  }
  
}
