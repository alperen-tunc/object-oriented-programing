package _04_factory._01_beispiel_geometrische_formen._02nachher.variant2;

import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Form;
import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Kreis;
import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Quadrat;
import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Rechteck;

public class FormFactory
{
    // ================================== Version 1 =========================================
    public Form createForm(String formAuswahl) {
        Form form = null;
        if (formAuswahl.equalsIgnoreCase("K")) {
            form = new Kreis();
        } else if (formAuswahl.equalsIgnoreCase("R")) {
            form = new Rechteck();
        } else if (formAuswahl.equalsIgnoreCase("Q")) {
            form = new Quadrat();
        }
        return form;
    }

    // ================================== Version 2 =========================================
    //private Map<String, Form> auswahlFormMap;
    //
    //public FormFactory( ) {
    //  this.auswahlFormMap = new HashMap<>();
    //  auswahlFormMap.put("K", new Kreis());
    //  auswahlFormMap.put("R", new Rechteck());
    //  auswahlFormMap.put("Q", new Quadrat());
    //  //auswahlFormMap.put("D", new Dreieck()); // so einfach wird das System mit einer neuen Form erweitert
    //}
    //
    //public Form getForm( String formAuswahl) {
    //  //formAuswahl = formAuswahl.toUpperCase();
    //  //Form form = auswahlFormMap.get(formAuswahl); // wenn key nicht vorhanden ist => null
    //  //return form;
    //  return auswahlFormMap.get(formAuswahl.toUpperCase()); // wenn key nicht vorhanden ist => null
    //}
    // =============================================================================
}
