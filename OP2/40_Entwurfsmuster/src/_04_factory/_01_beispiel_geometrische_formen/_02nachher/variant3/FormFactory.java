package _04_factory._01_beispiel_geometrische_formen._02nachher.variant3;

import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Form;

public abstract class FormFactory
{
    public abstract Form createForm();

    public static FormFactory createFormFactory( String formAuswahl ) {
        FormFactory formFactory = null;
        if (formAuswahl.equalsIgnoreCase("K")) {
            formFactory = new KreisFactory();
        } else if (formAuswahl.equalsIgnoreCase("R")) {
            formFactory = new RechteckFactory();
        } else if (formAuswahl.equalsIgnoreCase("Q")) {
            formFactory = new QuadratFactory();
        }
        return formFactory;
    }
}
