package _01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher;


import _01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Adresse;
import _01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Versandoption;

public class Bestellung {
	
	private Versandoption versender;
	private Adresse zielort;
	
	public Bestellung( Adresse zielort, Versandoption versender){
		this.zielort = zielort;
		this.versender = versender;
	}
	
	public Versandoption getVersendeMethode() {
		return versender;
	}
	public void setVersendeMethode( Versandoption versender) {
		this.versender = versender;
	}
	public Adresse getZielort() {
		return zielort;
	}
	public void setZielort( Adresse zielort) {
		this.zielort = zielort;
	}
	
}

//---------------------------------------------------------------------------------------------------

