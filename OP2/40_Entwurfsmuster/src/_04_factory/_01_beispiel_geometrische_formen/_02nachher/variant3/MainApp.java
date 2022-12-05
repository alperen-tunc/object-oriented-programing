package _04_factory._01_beispiel_geometrische_formen._02nachher.variant3;

import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Form;

import javax.swing.*;

public class MainApp
{
    public static void main( String[] args ) {
        System.out.println("============================================================");
        String message = "Gewünschte geometrische Form bitte eingeben \n" +
                "(K für Kreis, R für Rechteck, Q für Quadrat)\n" +
                "0 für Beenden:";
        while ( true ) {
            String formAuswahl = JOptionPane.showInputDialog(message);
            if (formAuswahl.equalsIgnoreCase("0"))
                break;
            formZeichnen(formAuswahl);
        }
        System.out.println("======================= end of main() ======================");
    }
    // =============================================================================
    private static void formZeichnen( String formAuswahl ) {
        FormFactory formFactory = FormFactory.createFormFactory(formAuswahl);
        if (formFactory == null)
            System.out.println("Form unbekannt!");
        else {
            Form form = formFactory.createForm();
            form.zeichnen();
        }
    }
}
