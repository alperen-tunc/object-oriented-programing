package _04_factory._01_beispiel_geometrische_formen._01_vorher;

import javax.swing.*;

public class App
{
    public static void main(String[] args)
    {
        String message = "Gewünschte geometrische Form bitte eingeben \n" +
                "(K für Kreis, R für Rechteck, Q für Quadrat)\n" +
                "0 für Beenden:";
        while ( true ) {
            String formAuswahl = JOptionPane.showInputDialog(message);
            if (formAuswahl.equalsIgnoreCase("K")) {
                Kreis kreis = new Kreis();
                kreis.zeichnen();
            } else if (formAuswahl.equalsIgnoreCase("R")) {
                Rechteck rechteck = new Rechteck();
                rechteck.zeichnen();
            } else if (formAuswahl.equalsIgnoreCase("Q")) {
                Quadrat quadrat = new Quadrat();
                quadrat.zeichnen();
            } else if (formAuswahl.equalsIgnoreCase("0")) {
                break;
            } else {
                System.out.println("Form unbekannt!!!");
            }
        }

        System.out.println("\n\nEnd of Main..");
    }
}
