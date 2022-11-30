package _01_strategy.aufgaben.aufgabe_1_versandkosten.t02_nachher;


import _01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Adresse;

public class Bestellung {
	
	private Adresse zielort;
	
	public Bestellung(Adresse zielort){
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

