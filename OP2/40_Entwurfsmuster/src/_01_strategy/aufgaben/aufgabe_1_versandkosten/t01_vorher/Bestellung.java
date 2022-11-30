package op2.t04_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.t01_vorher;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Adresse;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.aufgaben.aufgabe_1_versandkosten.entities.Versandoption;

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

