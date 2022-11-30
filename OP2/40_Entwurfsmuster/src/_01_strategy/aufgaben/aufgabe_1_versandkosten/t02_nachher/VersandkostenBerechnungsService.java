package op2.t04_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher.versandstrategien.VersandStrategie;

// Wir simulieren eine einfache Kostenberechnungsanwendung.
// Die entstehenden Kosten werden auf Basis des verwendeten Versandanbieters berechnet: Hermes, DHL, UPS.
// Auf den ersten Blick sieht diese Klasse ganz normal aus.
// Wir prüfen den Typ der Versendemethode in einer Enumeration und rufen dann eine Methode auf,
// um die Kosten entsprechend zu berechnen.
// Was könnten die Probleme sein?
public class VersandkostenBerechnungsService {

	private VersandStrategie strategie;
	
	public void setStrategie( VersandStrategie strategie ) {
		this.strategie = strategie;
	}
	
	public double berechneVersandkosten( Bestellung bestellung) {
		return strategie.berechneVersandkosten(bestellung);
	}
	
}

//---------------------------------------------------------------------------------------------------------------------------------























