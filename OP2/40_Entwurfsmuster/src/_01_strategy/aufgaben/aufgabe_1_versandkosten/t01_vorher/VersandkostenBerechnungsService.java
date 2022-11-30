package _01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher;

// Wir simulieren eine einfache Kostenberechnungsanwendung. Die entstehenden Kosten werden auf Basis des
// verwendeten Versandanbieters berechnet: Hermes, DHL, UPS. 
// Auf den ersten Blick sieht diese Klasse ganz normal aus. Wir prüfen den Typ der Versendemethode in einer Enumeration
// und rufen dann eine Methode auf, um die Kosten entsprechend zu berechnen. 
// Was könnten die Probleme sein?
public class VersandkostenBerechnungsService {

	public double berechneVersandkosten( Bestellung1 bestellung) {
		
		double result = -1.00d;
		switch (bestellung.getVersendeMethode()) {
		case DHL:
			result = berechneFuerDHL(bestellung);			
			break;
		case HERMES:
			result = berechneFuerHermes(bestellung);
			break;			
		case UPS:
			result = berechneFuerUPS(bestellung);			
			break;
		}
		return result;
	}
	
	private double berechneFuerDHL( Bestellung1 bestellung) {
		return 3.50d;
	}
	
	private double berechneFuerHermes( Bestellung1 bestellung) {
		return 2.95d;
	}

	private double berechneFuerUPS( Bestellung1 bestellung) {
		return 4.00d;
	}
}

//---------------------------------------------------------------------------------------------------------------------------------

