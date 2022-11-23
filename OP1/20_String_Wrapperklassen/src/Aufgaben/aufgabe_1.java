package Aufgaben;
/*
 * Schreiben Sie ein Programm, das die Anzahl eines bestimmten Buchstaben in einer Zeichenkette zählt. Hierbei soll jedoch
 * unterschieden werden ob Groß- oder Kleinbuchstaben.
 * Ist also der Buchstabe Klein sollen nur die Anzahl aller kleinen gleichen Buchstaben angegeben werden.
 *
 *  a) Erstellen Sie für das Programm eine Methode zaehleBuchstaben die als Parameter den String und den gesuchten Char von der Main
 *      aus übergeben bekommt und die Anzahl zurückgibt.
 *      Lassen Sie sich dann die Anzahl über die Main auf der Konsole ausgeben.
 *  b) Lassen Sie sich durch Berechnung anzeigen aus wie vielen Wörtern der Satz besteht.
 */

import java.util.Objects;
public class aufgabe_1 {
    static int zaehleBuchstaben(String s, char c)
    {
        int counter = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char aktuellerBuchstabe = s.charAt(i);
            if (aktuellerBuchstabe == c)
            {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args)
    {

        String s = "Heute ist die Welt noch in Ordnung.";
        char c = 'e';

        System.out.println("Anzahl: " + zaehleBuchstaben(s, c));

        c = ' ';
        int anzahlWörter = zaehleBuchstaben(s, c)+1;
        System.out.println("Anzahl der Wörter des String s ist : "+anzahlWörter);

    }

}

