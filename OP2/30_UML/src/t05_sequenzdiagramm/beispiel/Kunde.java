package op2.t03_UML.t05_sequenzdiagramm.beispiel;

public class Kunde {
  
  public void einzahlung() {
  
    try {
      Konto konto = new Konto(); // Konto auswählen
      double betrag = 200;       // Betrag in € eingeben
      konto.einzahlen(betrag);
    } catch ( Exception e ) {
      // todo bei nicht-erfolgreicher Ausführung
    }
  }
}
