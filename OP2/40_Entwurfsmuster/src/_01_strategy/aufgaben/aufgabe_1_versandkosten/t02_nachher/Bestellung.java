package op2.t04_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Adresse;

public class Bestellung {
	
	private Adresse zielort;
	
	public Bestellung( Adresse zielort){
		this.zielort = zielort;

	}
	
	public Adresse getZielort() {
		return zielort;
	}

	public void setZielort( Adresse zielort) {
		this.zielort = zielort;
	}
	
}

//---------------------------------------------------------------------------------------------------

