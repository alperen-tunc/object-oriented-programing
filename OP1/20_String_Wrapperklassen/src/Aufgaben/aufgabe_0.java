package Aufgaben;
/*
 * Aufgabe 0
 * Schreiben Sie ein Programm das einen String satz einführt der mit der Zeichenkette: "Heute ist wunderbares Wetter, fahren wir
 * doch zum Strand" befüllt wird.
 * a) Lassen sie sich die Gesamtlänge des String satz ausgeben. Beachten Sie er startet von Index 0;
 * b) Geben Sie die Index-Position des Buchstaben W von "Wetter" aus dem String satz auf der Konsole aus.
 * c) Lassen Sie sich das letzte kleine "r" zusammen mit der Index-Position im String satz anzeigen.
 * d) Erstellen Sie aus 2 Substrings den neuenSatz = "Heute fahren wir doch zum Strand."
 */

public class aufgabe_0
{
    public static void main(String[] args)
    {
        String zeichenkette = "Heute ist wunderbares Wetter, fahren wir doch zum Strand";
        System.out.println(zeichenkette);

        System.out.println("index-Position von W: " + zeichenkette.indexOf("We"));

        System.out.println("Letzte 'r' " + zeichenkette.lastIndexOf("r"));

        StringBuffer neuenSatz = new StringBuffer("Heute fahren wir");

        neuenSatz.append(" doch zum Strand.");

        String ergebnis = neuenSatz.toString();

        System.out.println(ergebnis);

        String[] teilSatz = ergebnis.split(" ");

        System.out.println(teilSatz[2]);

    }
}
