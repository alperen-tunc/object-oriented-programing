package _04_factory._01_beispiel_geometrische_formen._02nachher.variant1;

import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Form;
import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Kreis;
import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Quadrat;
import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Rechteck;

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
        Form form = null;
        if (formAuswahl.equalsIgnoreCase("K")) {
            form = new Kreis();
        } else if (formAuswahl.equalsIgnoreCase("R")) {
            form = new Rechteck();
        } else if (formAuswahl.equalsIgnoreCase("Q")) {
            form = new Quadrat();
        }
        if (form != null)
            form.zeichnen();
        else
            System.out.println("Form unbekannt!");
    }
}
